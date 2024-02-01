package com.uisrael.microservicioconfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroservicioconfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioconfigServerApplication.class, args);
	}

}
