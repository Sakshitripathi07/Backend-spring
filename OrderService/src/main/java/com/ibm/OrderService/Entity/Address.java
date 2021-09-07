package com.ibm.OrderService.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "address")
public class Address {
	@Id
	private int addressId;

	@Column(name = "house_Number")
	private int houseNumber;

	@Column(name = "street_Name")
	private String streetName;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "postal_Code")
	private double postalCode;

	@Column(name = "username")
	private String username;

	public Address() {
		super();
	}

	public Address(int addressId, int houseNumber, String streetName, String city, String state, String country,
			double postalCode, String username) {
		super();
		this.addressId = addressId;
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
		this.username = username;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(double postalCode) {
		this.postalCode = postalCode;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}
}
