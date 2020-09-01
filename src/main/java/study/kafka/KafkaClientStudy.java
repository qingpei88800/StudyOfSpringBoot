package study.kafka;

import java.util.*;

import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.StringDeserializer;

/**
 * @author liuqingpei
 * @date 2020/7/29
 */
public class KafkaClientStudy {

	private static final String[] BROKER_LIST = new String[] { "localhost:8080" };
	private static final String GROUP_ID = "group.1";
	private static final String CLIENT_ID = "client.1";
	private static final String[] topics = new String[] { "topic1" };

	public static void main(String[] args) {
		Properties properties = initProperties();
		KafkaConsumer<String, Object> consumer = new KafkaConsumer<String, Object>(properties);
		consumer.subscribe(Arrays.asList(topics));
		Map<TopicPartition, OffsetAndMetadata> offsets = new HashMap<>();
		// 再均衡监听器
		consumer.subscribe(Arrays.asList(topics), new ConsumerRebalanceListener() {
			@Override
			public void onPartitionsRevoked(Collection<TopicPartition> collection) {
				// 在再均衡开始之前和消费者停止读取消息之后被调用
				consumer.commitSync(offsets);
				offsets.clear();
			}

			@Override
			public void onPartitionsAssigned(Collection<TopicPartition> collection) {
				// 在重新分配分区之后和消费者开始读取消费之前被调用

			}
		});
		try {
			while (true) {
				ConsumerRecords<String, Object> consumerRecords = consumer.poll(1000L);
				Iterator<ConsumerRecord<String, Object>> iterator = consumerRecords.iterator();
				while (iterator.hasNext()) {
					ConsumerRecord<String, Object> record = iterator.next();
					offsets.put(new TopicPartition(record.topic(), record.partition()),
					        new OffsetAndMetadata(record.offset() + 1));
					System.out.println("主题：" + record.topic());
					System.out.println("分区：" + record.partition());
					System.out.println("消息所在分区偏移量：" + record.offset());
					System.out.println("key：" + record.key());
					System.out.println("key序列化后大小：" + record.serializedKeySize());
					System.out.println("value：" + record.value());
					System.out.println("value序列化后大小：" + record.serializedValueSize());
					System.out.println("消息头部内容：" + record.headers());
					System.out.println("时间戳：" + record.timestamp());
					System.out.println("时间类型：" + record.timestampType());
					System.out.println("CRC32的校验值：" + record.checksum());
				}
				// 偏移量提交
				consumer.commitAsync(offsets, null);

				// 获取消息集中所有分区
				Set<TopicPartition> partitions = consumerRecords.partitions();
				for (TopicPartition topicPartition : partitions) {
					// 获取消息集中指定分区的消息
					List<ConsumerRecord<String, Object>> records = consumerRecords.records(topicPartition);
					for (ConsumerRecord<String, Object> record : records) {
						System.out.println("");
					}
				}
				// 偏移量提交
				consumer.committed(partitions);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			consumer.close();
		}
	}

	private static Properties initProperties() {
		Properties properties = new Properties();
		properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BROKER_LIST);
		properties.put(ConsumerConfig.GROUP_ID_CONFIG, GROUP_ID);
		properties.put(ConsumerConfig.CLIENT_ID_CONFIG, CLIENT_ID);
		// 拦截器
		properties.put(ConsumerConfig.INTERCEPTOR_CLASSES_CONFIG, ConsumerInterceptorTTL.class.getName());
		return properties;
	}
}
