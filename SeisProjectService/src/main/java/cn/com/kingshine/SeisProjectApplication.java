package cn.com.kingshine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangfx
 * @date 2023/02/21
 */
@RefreshScope
@RestController
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SeisProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(SeisProjectApplication.class, args);
	}
}