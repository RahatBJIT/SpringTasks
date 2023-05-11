package com.bit.AutowirefPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutowirefPracticeApplication {

	public static void main(String[] args) {
//		SpringApplication.run(AutowirefPracticeApplication.class, args);

		ApplicationContext context =
				SpringApplication.run(AutowirefPracticeApplication.class, args);
		Trader trader1 = context.getBean(Trader.class);
		trader1.getDetails();
	}

}
