package ru.malychev.weekdays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.malychev.weekdays.configs.Config;
import ru.malychev.weekdays.entities.WeekDay;

public class WeekDays {
	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(Config.class);
		WeekDay weekDay = context.getBean(WeekDay.class);
		System.out.println("It's " + weekDay.getWeekDayName() + " today!");
	}
}
