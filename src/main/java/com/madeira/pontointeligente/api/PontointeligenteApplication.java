package com.madeira.pontointeligente.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//(exclude = { SecurityAutoConfiguration.class })
public class PontointeligenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PontointeligenteApplication.class, args);
	}

}
