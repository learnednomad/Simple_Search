package search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StoreParticipants {
	ArrayList<String> people = new ArrayList<>();
	final Scanner scanner = new Scanner(System.in);

	public StoreParticipants(ArrayList<String> people) {
		this.people = participants();
	}


	private ArrayList<String> participants (){
		System.out.println("Enter the number of people:");
		int response = Integer.parseInt(scanner.nextLine());
		String name = scanner.nextLine();

		for (int i = 0; i <response ; i++) {
			this.people.add(name);
		}


		return this.people;
	}




}
