package cn.ekgc.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * 用户信息管理网关启动类.
 *
 * @Author: Davis
 * @Version: 1.0.0
 */
@SpringBootApplication
public class CarGatewayStarter {
	public static void main(String[] args) {
		SpringApplication.run(CarGatewayStarter.class,args);
	}

	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		// 设定当网关项目得到请求之后的重新转发地址
		return builder.routes()
				.route("myRoute1", r -> r.path("/ums/**").uri("http://localhost:8080"))
				.route("userRoute", r -> r.path("/user/**").uri("http://localhost:11111"))
				.build();
	}

}
