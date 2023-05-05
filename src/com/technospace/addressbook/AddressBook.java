package com.technospace.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
	//Contacts[] contacts=new Contacts[5];
	ArrayList<Contacts> contactList=new ArrayList<Contacts>();
	//int i=0;
	//contacts[0],contacts[1],contacts[2],contacts[3],contacts[4],contacts[5]
	Scanner sc=new Scanner(System.in);
	
	public void addContacts(){
		Contacts contacts = new Contacts();
		//contacts[i]=new Contacts();
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
		contactList.add(contacts);
		//i++;
	}
	public void showContacts(){
		
			for(int j=0;j<contactList.size();j++){
				Contacts contacts = contactList.get(j);
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
			
			System.out.println("Enter the First name to update contact:");
			String fname=sc.next();
			for(int i=0;i<contactList.size();i++){
				Contacts contacts = contactList.get(i);
			
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
			contactList.add(contacts);
		}
	}
		public void DeleteContacts(){
		System.out.println("Enter the First name to Delete Contact:");
		String fname = sc.next();
		for(int i=0;i<contactList.size();i++){
			Contacts contacts=contactList.get(i);
		
		if(fname.equals(contacts.getFirstName())){
			System.out.println("Contact is Available");
			contactList.remove(contacts);
			System.out.println("Contact is Deleted");
		}
		else{
			System.out.println("Contact is not Available");
		}
		
	}
		}
	
	

}
