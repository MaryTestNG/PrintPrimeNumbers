package com.ap.nellore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrintPrimeNumbersApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrintPrimeNumbersApplication.class, args);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello "+ i);
		}

	}

}
