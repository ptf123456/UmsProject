package cn.ekgc.car;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 用户功能模块provider-启动类.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
@MapperScan("cn.ekgc.car.dao")
@EnableEurekaClient
@SpringBootApplication
public class UserProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(UserProviderStarter.class,args);
	}
}
