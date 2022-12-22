package com.nttdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NttdataSpringMicroservicesAlumnadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NttdataSpringMicroservicesAlumnadoApplication.class, args);
	}

}
