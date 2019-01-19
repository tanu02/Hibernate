package com.hibernate.configuration;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LocationId implements Serializable {

	@Column(name = "COUNTRY_NAME")
	String country;
	@Column(name = "STATE_NAME")
	String state;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
