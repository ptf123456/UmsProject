package cn.ekgc.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 智慧公务车信息平台-注册中心启动类.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class CarServerStarter {
	public static void main(String[] args) {
		SpringApplication.run(CarServerStarter.class,args);
	}
}
