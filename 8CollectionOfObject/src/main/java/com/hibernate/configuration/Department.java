package com.hibernate.configuration;

import javax.persistence.Embeddable;

@Embeddable
public class Department {

	int headCounts;
	String description;

	public int getHeadCounts() {
		return headCounts;
	}

	public void setHeadCounts(int headCounts) {
		this.headCounts = headCounts;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
