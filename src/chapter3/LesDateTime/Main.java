package chapter3.LesDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

	public static void main(String[] args) {
		//1-Creating
		/*
		LocalDate ld = LocalDate.now(); //now() est une méthode de classe
		System.out.println(ld);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);*/
		
		//LocalDate ld = LocalDate.of(1985, 7, 10);
		
		//LocalDate ld = LocalDate.of(1985, Month.JULY, 10);
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		/*LocalTime lt = LocalTime.of(15, 30);
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);
		System.out.println("Manipulating");*/
        //2-Manipulating
		
		//ld = ld.plusDays(2);
		//System.out.println(ld.plusDays(2));
		//System.out.println(ld);
		//ld = ld.minusYears(2);
		//ld = ld.minusWeeks(1);
		//System.out.println(ld);
		/*
		LocalDate ld2 = LocalDate.of(1985, Month.JULY, 30);
		ld2.plusDays(2);
				
		System.out.println(ld2);*/
		//Period period = Period.of(2, 1, 3); 
		//ld = ld.minus(period);
		//System.out.println(ld);
		
		//3-Formatting 
		
		
		//System.out.println(ld.getDayOfWeek()); 
		//System.out.println(ld.getDayOfYear());
		//System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getMonth());
		System.out.println(ld);
		System.out.println(ld.format(DateTimeFormatter.ISO_LOCAL_DATE));
		/*
		DateTimeFormatter fs = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(fs);
		System.out.println(ld.format(fs));
		System.out.println(fs.format(ld));*/
		/*
		DateTimeFormatter fs = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println(ldt.format(fs));*/
		
		String birthday = "08/11/2015, 10:11";
		//String birthday = "10/10/2019";
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm");
		LocalDateTime d = LocalDateTime.parse(birthday,f);
		System.out.println(d);

	}

}
