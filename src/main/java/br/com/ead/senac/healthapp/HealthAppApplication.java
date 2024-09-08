package br.com.ead.senac.healthapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HealthAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthAppApplication.class, args);
	}

}
