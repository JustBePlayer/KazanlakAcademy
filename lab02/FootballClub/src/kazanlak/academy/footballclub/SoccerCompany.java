package kazanlak.academy.footballclub;

import java.time.LocalDate;
import java.util.Arrays;

public class SoccerCompany{
	private Employee[] employees;
	private int currentIndex;
	
	public SoccerCompany(){
		currentIndex = 0;
		employees = new Employee[60];
	}
	
	public void addEmployee(Employee employee) throws Exception{
		if(currentIndex < employees.length - 1){
			employees[currentIndex] = employee;
			currentIndex++;
		} else {
			throw new Exception("max sice of capacity");
		}
	}
	
	public void print(){
		Arrays.sort(employees, 0, currentIndex);
		for(int i = 0; i < currentIndex; i++){
			employees[i].print();
		}
	}
	
	public void printByContractEnd(){
		LocalDate dateNow = LocalDate.now();
		for(int i = 0; i < currentIndex; i++){
			if(employees[i].getContractEnd().compareTo(dateNow) < 0){
				employees[i].print();
			}
		}
	}
}
