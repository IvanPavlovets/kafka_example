package ru.job4j.kitchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KitchenApp {

	public static void main(String[] args) {
		SpringApplication.run(KitchenApp.class, args);
		System.out.println("run");
	}

}
