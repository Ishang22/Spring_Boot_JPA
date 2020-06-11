package com.hotelapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address {
	@Id
	@GeneratedValue(generator="add_id",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="add_id",sequenceName="address_id")
	private Integer addressId;
	private String city;
	private long zipcode;
	private String state;
	private String streetName;
	

	public Address(String city, long zipcode, String state, String streetName) {
		super();
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
		this.streetName = streetName;
	}


	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", zipcode=" + zipcode + ", state=" + state
				+ ", streetName=" + streetName + "]";
	}
	
	
	
	
	
}
