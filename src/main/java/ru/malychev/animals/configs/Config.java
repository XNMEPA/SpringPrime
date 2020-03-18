package ru.malychev.animals.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.malychev.animals.entities.*;

@Configuration
public class Config {

	@Bean
	public Cat getCat(Parrot parrot){
		Cat cat = new Cat();
		cat.setName(getParrot().getName() + "-killer");
		return cat;
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
