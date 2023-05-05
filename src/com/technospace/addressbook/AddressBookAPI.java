package com.technospace.addressbook;

import java.util.Scanner;

public class AddressBookAPI {
	Scanner sc = new Scanner(System.in);
	int choice;
	public void contactOperation(AddressBook myAddressBook){
		do
		{
		System.out.println("******CONTACT MENU******");
		System.out.println("1.ADD CONTACT \n2.SHOW CONTACT \n3.UPDATE CONTACT \n4.DELETE CONTACT");
		System.out.println("Enter the Choice");
		choice=sc.nextInt();
		switch(choice){
			case 1:
				myAddressBook.addContacts();
			break;
			case 2:
				myAddressBook.showContacts();
			break;
			case 3:
				myAddressBook.UpdateContacts();
			break;
			case 4:
				myAddressBook.DeleteContacts();
			break;
			default:
				System.out.println("Invalid Choice");
			break;
					}
			}while(choice<5);
		
	}
	private void showContacts() {
		// TODO Auto-generated method stub
		
	}
	private void addContacts() {
		// TODO Auto-generated method stub
		
	}
}
