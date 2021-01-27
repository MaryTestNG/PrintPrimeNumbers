package com.ap.nellore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PrintPrimeNumbersApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void test1() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("Hello "+ i);
		}
	}

}
