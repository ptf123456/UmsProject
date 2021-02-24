package cn.ekgc.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 用户信息系统启动类.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class UserConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(UserConsumerStarter.class,args);
	}
}
