package com.technospace.addressbook;

/***
 * 
 * @author Prerana Purkar
 *Contacts class for adding and Managing the contact information 
 */
public class Contacts {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String State;
	private String phoneNumber;
	private String zip;
	private String email;
	//Setter Method
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public void setCity(String city){
		this.city=city;
	}
	public void setState(String state){
		this.State=state;
	}
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	public void setZip(String zip){
		this.zip=zip;
	}
	public void setEmail(String email){
		this.email=email;
	}
	//Getter Method
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getAddress(){
		return this.address;
	}
	public String getCity(){
		return this.city;
	}
	public String getState(){
		return this.State;
	}
	public String getPhoneNumber(){
		return this.phoneNumber;
	}
	public String getZip(){
		return this.zip;
	}
	public String getEmail(){
		return this.email;
	}
}
