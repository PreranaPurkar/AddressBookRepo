package com.technospace.addressbook;

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
		
		AddressBook addressbook=new AddressBook();
		int choice;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("******ADDRESSBOOK MENU******");
		System.out.println("1.ADD CONTACT \n2.SHOW CONTACT \n3.UPDATE CONTACT \n4.DELETE CONTACT");
		System.out.println("Enter the Choice");
		choice=sc.nextInt();
		switch(choice){
			case 1:
				addressbook.addContacts();
			break;
			case 2:
				addressbook.showContacts();
			break;
			case 3:
				addressbook.UpdateContacts();
			break;
			case 4:
			break;
			default:
				System.out.println("Invalid Choice");
			break;
					}
			}while(choice<5);
		}

}
