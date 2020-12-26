package com.fast.auth;

import com.fast.common.security.annotation.EnablePigFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author lengleng
 * @date 2018年06月21日 认证授权中心
 */
@SpringCloudApplication
@EnablePigFeignClients
public class FastAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastAuthApplication.class, args);
	}

}
