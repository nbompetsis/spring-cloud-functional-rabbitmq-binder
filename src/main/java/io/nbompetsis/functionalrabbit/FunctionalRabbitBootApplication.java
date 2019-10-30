package io.nbompetsis.functionalrabbit;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FunctionalRabbitBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FunctionalRabbitBootApplication.class, args);
	}
	
	private int counter=0;

	@Bean
	public Function<String, String> inputFunction() {
		return s -> {
			System.out.println("inputFunction -> Received from Rabbit: " + s);
			return s.toUpperCase();
		};
	}
	
	
	@Bean
	public Function<String, String> outputFunction() {
		return s -> {
			System.out.println("outputFunction -> Received from inputFunction-out-0: " + s);
			return s.toLowerCase();
		};
	}
	
	@Bean
	public Supplier<String> rabbitSup() {
		return () -> {
			counter++;
			return "rabbitSup sends " + counter;
		};
	}
	
	@Bean
	public Supplier<String> rabbitSup2() {
		return () -> {
			counter++;
			return "rabbitSup2 sends " + counter;
		};
	}
	
}
