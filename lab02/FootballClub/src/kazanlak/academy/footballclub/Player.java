package kazanlak.academy.footballclub;

import java.time.LocalDate;

public class Player extends Employee{
	private PlayerPosition position;
	private int gamesPlayed;
	
	public Player(String name, int age, LocalDate contractEnd, PlayerPosition position, int gamePlayed) {
		super(name, age, contractEnd);
		this.position = position;
		this.gamesPlayed = gamePlayed;
		baseSalary = 10_000;
	}
	
	@Override
	public void print(){
		super.print();
		System.out.println(String.format("| Position: %s | Games played: %s", position.toString(), gamesPlayed));
	}

	@Override
	public double getSalary() {
		if(gamesPlayed == 0){
			return baseSalary;
		}
		return baseSalary + gamesPlayed*250;
	}
	
}
