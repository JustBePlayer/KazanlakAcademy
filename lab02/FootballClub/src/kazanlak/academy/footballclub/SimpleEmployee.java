package kazanlak.academy.footballclub;

import java.time.LocalDate;


public class SimpleEmployee extends Employee {
	
	private String position;
	private int yearInCompany;
	
	public SimpleEmployee(String name, int age, LocalDate contractEnd, String position, int yearsInCompany) {
		super(name, age, contractEnd);
		this.position = position;
		this.yearInCompany = yearsInCompany;
		baseSalary = 1000;
	}
	
	@Override
	public double getSalary() {
		double result = baseSalary;
		if(yearInCompany == 0){
			return result;
		}
		for(int i = 0; i < yearInCompany; i++){
			result *= 1.05;
		}
		return result;
	}
	
	public void print(){
		System.out.println(String.format("| Position %s | YearsInCompany: %d", position, yearInCompany));
	}
	
	
}
