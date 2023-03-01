package com.hcm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class HcmApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcmApplication.class, args);
	}

}
