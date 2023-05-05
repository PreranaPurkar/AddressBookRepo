package com.technospace.addressbook;

import java.util.HashMap;
import java.util.Scanner;

/***
 * 
 * @author Prerana Purkar
 * AddressBookMain class performing different operations on Address Book 
 */
public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Welcome Message for user
		System.out.println("Welcome to Address Book Program");
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		HashMap<String,AddressBook> addressBookMap = new HashMap<String,AddressBook>();
		do
		{
			System.out.println("******** ADDRESSBOOK MENU ******** ");
			System.out.println("1.CREATE NEW ADDRESSBOOK \n2.SHOW ADDRESSBOOK \n3.SELECT ADDRESSBOOK"
			+"\n4.UPDATE ADDRESSBOOK \n5.DELETE ADDRESSBOOK");
			
			System.out.println("Enter the choice:");
			 choice =sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Enter the AddressBooK Name:");
			String addressBookName = sc.next();
			AddressBook addressBook=new AddressBook();
			addressBookMap.put(addressBookName, addressBook);
			
			break;
		case 2:
			System.out.println(addressBookMap.keySet());
			break;
		case 3:
			System.out.println("Enter the AddressBook Name in which you want to add contact:");
			String addressBookName2 = sc.next();
			AddressBook myAddressBook = addressBookMap.get(addressBookName2);
			AddressBookAPI addressBookAPI = new AddressBookAPI();
			addressBookAPI.contactOperation(myAddressBook);
			break;
		case 4:
			break;
		case 5:
			break;
		
		}
		
		}while(choice<5);
	}

}
