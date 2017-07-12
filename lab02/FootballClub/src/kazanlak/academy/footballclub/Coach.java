package kazanlak.academy.footballclub;

import java.time.LocalDate;

public class Coach extends Employee {
	private CoachType type;
	private int awardsWon;
	
	public Coach(String name, int age, LocalDate contractEnd, CoachType type, int awardsWon) {
		super(name, age, contractEnd);
		this.type = type;
		this.awardsWon = awardsWon;
		baseSalary = 8000;
	}
	
	@Override
	public void print(){
		super.print();
		System.out.println(String.format("| CoachType: %s | Awards won: %s", type.toString(), awardsWon));
	}

	@Override
	public double getSalary() {
		double result = baseSalary;
		if(awardsWon > 5){
			result += 5000;
		}
		return result;
	}
	
	
}
