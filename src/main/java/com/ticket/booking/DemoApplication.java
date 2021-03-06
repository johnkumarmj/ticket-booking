package com.ticket.booking;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder app = new SpringApplicationBuilder(DemoApplication.class);
  //SpringApplication.run(DemoApplication.class, args);
	app.run();
		System.out.println("test");
	}

}
