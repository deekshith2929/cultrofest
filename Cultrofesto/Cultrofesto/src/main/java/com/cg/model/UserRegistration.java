package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="user1")
public class UserRegistration 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
     @Column(name = "user first name")
	 private String firstName;
	
	 @Column(name = "User Last Name")
	 private String lastName;
	 
	 @Column(name= "Event Name")
	 private String eventName;
	 
	 @Column(name = "User Address")
	 private String address;
	 
	 @Column(name = "City")
	 private String city;
	 
	 @Column(name ="State")
	 private String state;
	 
	 @Column(name = "User Age")
	 private int age;
	 
	 @Column(name = "User EmailId")
	 private String email;
	 
	 @Column(name = "User mobileNo")
	 private Long phoneNo;
	 
	 @Column(name = "Adults Count")
	 private int adultsCount;
	 
	 @Column(name = "Child Count")
	 private int childCount;
	 
	 @Column(name = "Food")
	 private String food;
	 
	 @Column(name = "All visitors names")
	 private String visitorsNames;
	 
	 @Column(name = "Total Amount")
	 private long totalPrice;

	public UserRegistration() {
		super();
		
	}

	public UserRegistration(Long id, String firstName, String lastName,String eventName, String address, String city, String state,
			int age, String email, Long phoneNo, int adultsCount, int childCount, String food, String visitorsNames,
			long totalPrice) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eventName=eventName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.age = age;
		this.email = email;
		this.phoneNo = phoneNo;
		this.adultsCount = adultsCount;
		this.childCount = childCount;
		this.food = food;
		this.visitorsNames = visitorsNames;
		this.totalPrice = totalPrice;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getAdultsCount() {
		return adultsCount;
	}

	public void setAdultsCount(int adultsCount) {
		this.adultsCount = adultsCount;
	}

	public int getChildCount() {
		return childCount;
	}

	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getVisitorsNames() {
		return visitorsNames;
	}

	public void setVisitorsNames(String visitorsNames) {
		this.visitorsNames = visitorsNames;
	}

	public long getTotalPrice() {
		return totalPrice;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "UserRegistration [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", eventName="
				+ eventName + ", address=" + address + ", city=" + city + ", state=" + state + ", age=" + age
				+ ", email=" + email + ", phoneNo=" + phoneNo + ", adultsCount=" + adultsCount + ", childCount="
				+ childCount + ", food=" + food + ", visitorsNames=" + visitorsNames + ", totalPrice=" + totalPrice
				+ "]";
	}

	

	
	
	
}
