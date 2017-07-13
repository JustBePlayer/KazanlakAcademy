package sap.kazanlak.academy.datastructures.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class HotPotatoe {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			System.out.print("Number of players: ");
			int playersNumber = scanner.nextInt();
			String[] players = new String[playersNumber];
			
			for(int i = 0 ; i < playersNumber; i++){
				
				System.out.print(String.format("Enter playe%d name: ", i+1));
				players[i] = scanner.next();
			}
			
			System.out.print("Number of passes: ");
			int passes = scanner.nextInt();
			
			List<String> rankings = getRankings(players, passes);
			System.out.println("Rankings: ");
			for (int i = 0; i < rankings.size(); i++) {
				System.out.println(String.format("%d.%s", i+1, rankings.get(i)));
			}
		}
	}
	
	private static List<String> getRankings(String[] players, int passes){
		Deque<String> result = new LinkedList<>();
		Queue<String> circle = new ArrayDeque<>();
		
		for (String player : players) {
			circle.add(player);
		}
		
		int index = 0;
		int roundNumber = 0;
		
		while (circle.size() > 1){
			String frontplayer = circle.poll();
			if (index == passes){
				roundNumber++;
				System.out.println(String.format("Round: {%d} | Looser: %s", roundNumber, frontplayer));
				result.addFirst(frontplayer);
				index = 0;
				continue;
			}
			circle.add(frontplayer);
			index++;
		}
		
		String winner = circle.poll();
		System.out.println(String.format("And the winner is: %s", winner));
		result.addFirst(winner);
		return new ArrayList<>(result);
	}
}
