package ru.malychev.weekdays.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.malychev.weekdays.entities.*;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Component
public class Config {
	@Bean
	public WeekDay getDay() {
		DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
		switch (dayOfWeek) {
			case MONDAY: return new Monday();
			case TUESDAY: return new Tuesday();
			case WEDNESDAY: return new Wednesday();
			case THURSDAY: return new Thursday();
			case FRIDAY: return new Friday();
			case SATURDAY: return new Saturday();
			default: return new Sunday();
		}
	}
}
