package kazanlak.academy.footballclub;

import java.time.LocalDate;

public abstract class Employee implements Comparable<Employee>{
	private String name;
	private int age;
	private LocalDate contractEnd;
	protected double baseSalary;
	
	public String getName(){
		return name;
	}
	
	public Employee(String name, int age, LocalDate contractEnd) {
		super();
		this.name = name;
		this.age = age;
		this.contractEnd = contractEnd;
	}
	
	public void print(){
		System.out.println(String.format("Name: %s | Age: %s | ContractDeadline: %s", name, age, contractEnd.toString()));
	}

	@Override
	public int compareTo(Employee o) {
		int result = contractEnd.compareTo(o.getContractEnd());
		if(result == 0){
			result =  name.compareTo(o.getName());
		}
		return result;
	}
	
	public LocalDate getContractEnd(){
		return contractEnd;
	}
	
	public abstract double getSalary();
	

}
