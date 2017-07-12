package kazanlak.academy.footballclub;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main {
	public static void main(String[] args) {
		SoccerCompany company = new SoccerCompany();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-d");
		Employee emp1 = new Player("Player1", 22, LocalDate.parse("2017-12-30", dtf), PlayerPosition.Defender, 20);
		
		Employee emp2 = new Player("Player2", 22, LocalDate.parse("2016-12-30", dtf), PlayerPosition.Half, 20);
		Employee emp3 = new Player("Player3", 22, LocalDate.parse("2015-06-30", dtf), PlayerPosition.Defender, 20);
		Employee emp4 = new Player("Player4", 22, LocalDate.parse("2018-05-30", dtf), PlayerPosition.Defender, 20);
		
		try {
			company.addEmployee(emp1);
			company.addEmployee(emp2);
			company.addEmployee(emp3);
			company.addEmployee(emp4);
			company.print();
			System.out.println(emp2.getSalary());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
