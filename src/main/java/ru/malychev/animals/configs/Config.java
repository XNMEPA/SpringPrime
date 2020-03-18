package ru.malychev.animals.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.malychev.animals.entities.Cat;
import ru.malychev.animals.entities.Dog;
import ru.malychev.animals.entities.Parrot;

@Configuration
public class Config {
	@Bean
	public Cat getCat() {
		return new Cat();
	}
	@Bean
	public Dog getDog() {
		return new Dog();
	}
	@Bean("parrot-kesha")
	public Parrot getParrot() {
		return new Parrot();
	}
}
