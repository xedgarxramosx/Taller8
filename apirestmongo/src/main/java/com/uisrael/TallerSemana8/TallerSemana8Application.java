package com.uisrael.TallerSemana8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TallerSemana8Application {

	public static void main(String[] args) {
		SpringApplication.run(TallerSemana8Application.class, args);
	}

}
