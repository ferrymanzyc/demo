package com.example.demo;

import org.elasticsearch.common.settings.Settings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		Settings settings = Settings.builder()
				.put("client.transport.sniff", false)
				.put("cluster.name", "es")
				.build();
		SpringApplication.run(DemoApplication.class, args);
	}

}
