package study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author liuqingpei
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("study.mybatis")
public class DemoApplication {



	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(DemoApplication.class);
		SpringApplication.run(DemoApplication.class, args);
	}



}
