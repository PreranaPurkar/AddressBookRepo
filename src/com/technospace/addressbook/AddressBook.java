package com.technospace.addressbook;

import java.util.Scanner;

public class AddressBook {
	Contacts contacts=new Contacts();
	Scanner sc=new Scanner(System.in);
	public void addContacts(){
		System.out.println("Enter the First Name:");
		contacts.setFirstName(sc.next());
		System.out.println("Enter the Last Name:");
		contacts.setLastName(sc.next());
		System.out.println("Enter the Address:");
		contacts.setAddress(sc.next());
		System.out.println("Enter the City:");
		contacts.setCity(sc.next());
		System.out.println("Enter the State:");
		contacts.setState(sc.next());
		System.out.println("Enter the Phone Number:");
		contacts.setPhoneNumber(sc.next());
		System.out.println("Enter the Zipcode:");
		contacts.setZip(sc.next());
		System.out.println("Enter the Email Id:");
		contacts.setEmail(sc.next());
	}
	public void showContacts(){
		if(contacts == null){
			System.out.println("Contact object is not available");
		}
		else{
			System.out.println("First Name:"+contacts.getFirstName());
			System.out.println("Last NAme:"+contacts.getLastName());
			System.out.println("Address:"+contacts.getAddress());
			System.out.println("City:"+contacts.getCity());
			System.out.println("State:"+contacts.getState());
			System.out.println("Phone Number:"+contacts.getPhoneNumber());
			System.out.println("Zip code:"+contacts.getZip());
			System.out.println("EMail Id:"+contacts.getEmail());
			}
		}
	public void UpdateContacts(){
		
		if (contacts == null){
			System.out.println("Contact object is not Available");
		}
		else{
			System.out.println("Enter the First name to update contact:");
			String fname=sc.next();
			if(fname.equals(contacts.getFirstName())){
				System.out.println("Contact is Available");
				System.out.println("Enter the Last Name:");
				contacts.setLastName(sc.next());
				System.out.println("Enter the Address:");
				contacts.setAddress(sc.next());
				System.out.println("Enter the City:");
				contacts.setCity(sc.next());
				System.out.println("Enter the State:");
				contacts.setState(sc.next());
				System.out.println("Enter the Phone Number:");
				contacts.setPhoneNumber(sc.next());
				System.out.println("Enter the Zipcode:");
				contacts.setZip(sc.next());
				System.out.println("Enter the Email Id:");
				contacts.setEmail(sc.next());
			}
			else{
			System.out.println("contact is not Available");
				}
			}
	}
	public void DeleteContacts(){
		System.out.println("Enter the First name to Delete Contact:");
		String fname = sc.next();
		if(fname.equals(contacts.getFirstName())){
			System.out.println("Contact is Available");
			contacts = null;
			System.out.println("Contact is Deleted");
		}
		else{
			System.out.println("Contact is not Available");
		}
		
	}

	
	

}
