package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Slf4j
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		for (int i=1; i<6 ; i++){
			int val=1;
			for(int j=1;j<=i;j++){
				System.out.print(val+" ");
				val = val * (i - j) / j;
			}
			System.out.println();
		}


	}
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
