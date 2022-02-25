package com.blz.Day10Problem;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	HashMap<String, AddressBookSystem> addressbook = new HashMap<>();

	/*
	 * Add Multiple Address book
	 * 
	 */

	public void addMultipleAddressBook() {
		while (true) {

			System.out.println("Enter selection \n1)To Access Address Book\n2)exit");
			int selection = sc.nextInt();
			switch (selection) {
			case 1:
				String name = sc.next();
				if (addressbook.containsKey(name)) {
					System.out.println("Entered Addressbook name already present");
				} else {
					AddressBookSystem address = new AddressBookSystem();
					System.out.println("Welcome to address book" + "" + name);
					addressbook.put(name, address);
				}
				break;

			case 2:
				System.out.println("exiting");
				System.exit(0);
			}

		}

	}

	public static void main(String[] args) {
		Main main = new Main();
		main.addMultipleAddressBook();
	}

}
