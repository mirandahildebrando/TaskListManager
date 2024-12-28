package task;

import java.util.ArrayList;
import java.util.Scanner;

public class ListManager {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> tasks = new ArrayList<>();
		
		System.out.println("** Welcome to the task list manager program **");
		
		System.out.println("Enter the number of tasks for the day:");
		int amount = scanner.nextInt();
		
		for(int i = 0; i <= amount; i++) {
			System.out.println("Enter the task: " + (i + 1) + ": ");
			String task = scanner.nextLine();
			tasks.add(task);
			
		}
		
		System.out.println("\nYour taks for today are: ");
		for (String task : tasks) {
			System.out.println("- " + task);
		}
		
	}

}
