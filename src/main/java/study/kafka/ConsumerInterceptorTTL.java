package study.kafka;

import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerInterceptor;
import org.apache.kafka.clients.consumer.ConsumerRecords;

/**
 * kafka消费 拦截器
 * 
 * @author liuqingpei
 * @date 2020/7/29
 */
public class ConsumerInterceptorTTL implements ConsumerInterceptor {
	@Override
	public ConsumerRecords onConsume(ConsumerRecords consumerRecords) {
		// 在poll（）方法返回之前调用拦截器的onConsume（）方法来对消息进行相应的定制化操作

		return consumerRecords;
	}

	@Override
	public void close() {

	}

	@Override
	public void onCommit(Map map) {
		// 在提交完消费位移之后调用拦截器的onCommit（）
	}

	@Override
	public void configure(Map<String, ?> map) {

	}
}
