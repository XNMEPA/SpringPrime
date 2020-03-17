package ru.malychev.animals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.malychev.animals.entities.*;

public class Animals {
	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext("ru.malychev.animals.entities");

		Cat cat = context.getBean(Cat.class);
		Dog dog = (Dog) context.getBean("dog");
		Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

		System.out.println(cat.getName());
		System.out.println(dog.getName());
		System.out.println(parrot.getName());
	}
}
