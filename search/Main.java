package search;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        collectEmployeeData();
    }
	public static void collectEmployeeData() {
		ArrayList<String> staffNames = new ArrayList<String>();
		System.out.println("Enter the number of people: ");
		Scanner scanner = new Scanner(System.in);
		int numb_people = scanner.nextInt();
		scanner.nextLine(); /*Free up the scanner console*/


		/* Collect names and data */
		System.out.println("Enter all people:");
		for (int i = 0; i < numb_people; i++) {
			String name = scanner.nextLine();
			staffNames.add(name);
		}

		menuOptions(staffNames);
	}

	public static void searchPeople(ArrayList<String> beel, String word) {
		for (int i = 0; i < beel.size(); i++) {
			if (beel.get(i).toLowerCase().contains(word.toLowerCase())) {
				System.out.println(beel.get(i));
			}
		}
	}

	public static void menuOptions(ArrayList<String> beel) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n"
				+ "=== Menu ===\n"
				+ "1. Find a person\n"
				+ "2. Print all people\n"
				+ "0. Exit");

		int num = scanner.nextInt();
		int max = 3;
		/*    MENU   */
		if (num < max) {
			switch (num) {
				case 1:
					System.out.println("Enter a name or email to search all suitable people.");
					String name = scanner.next();
					searchPeople(beel, name);
					menuOptions(beel);
					break;

				case 2:
					System.out.println("=== List of people ===");
					for (String a : beel) {
						System.out.println(a);
					}
					menuOptions(beel);
					break;

				case 0:
					System.out.println("Bye!");
					break;
			}

		} else {
			System.out.print("Incorrect option! Try again.\n");
			menuOptions(beel);
		}
	}

}
