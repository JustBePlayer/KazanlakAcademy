package sap.kazanlak.academy.datastructures.stack;

import java.util.Scanner;
import java.util.Stack;

public class Towers {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter number of buildings: ");
			int towersNumber = scanner.nextInt();
			int[] towers = new int[towersNumber];
			System.out.println();
			
			System.out.print("Enter number of towers: ");
			int numberOfTowers = scanner.nextInt();
			
			System.out.print("Enter heights: ");
			for (int i = 0; i < towers.length; i++) {
				towers[i] = scanner.nextInt();
			}

			System.out.println();
			System.out.print("Enter towers' height: ");

			int[] tHeight = new int[numberOfTowers];
			for (int i = 0; i < numberOfTowers; i++) {
				tHeight[i] = scanner.nextInt();
			}
			
			System.out.println("Results: ");
			
			for (int i = 0; i < numberOfTowers; i++) {
				System.out.println(maxReachedBuildings(towers, tHeight[i]));
			}
			
		}
	}
	
	private static int maxReachedBuildings(int[] towers, int towerHeight) {
		Stack<Integer> stack = new Stack<>();
		stack.push(towers[0]);
		int max = 1;
		int currentCover = 1;
		for (int i = 1; i < towers.length; i++) {

			while (!stack.isEmpty() && (towers[i] > stack.peek() || stack.peek() >= towerHeight)) {
				stack.pop();
				currentCover--;
			}
			stack.push(towers[i]);
			currentCover++;

			if (currentCover > max) {
				max = currentCover;
			}
		}
		return max;
	}
}
