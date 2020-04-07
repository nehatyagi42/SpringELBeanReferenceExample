package com.rtpl.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean")
public class Customer {

	@Value("#{addressBean}")
private Address address;
	
	@Value("{#addressBean.Country}")
	private String Country;
	
	@Value("#{addressBean.getFullAddress('london')}")
	private String fullAddress;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	@Override
	public String toString() {
		return "Customer [address=" + address + "\n, country=" + Country
				+ "\n, fullAddress=" + fullAddress + "]";
	}
	
	
	
	
}
