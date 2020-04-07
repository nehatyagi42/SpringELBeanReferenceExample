package com.rtpl.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addressBean")
public class Address {

	@Value("Block ABC, LakeView")
	private String street;
	
	@Value("98700")
	private int postcode;

	@Value("US")
	private String Country;
	
	public String getFullAddress(String prefix) {

		return prefix + " : " + street + " " + postcode + " " + Country;
	}
	
	public void setCountry(String country) {
		this.Country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public String getCountry() {
		return Country;
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode
				+ ", country=" + Country + "]";
	
}
}
