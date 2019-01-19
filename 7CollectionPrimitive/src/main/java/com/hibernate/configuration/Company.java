package com.hibernate.configuration;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPANY")
public class Company {

	@Id
	@Column(name = "COMPANY_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int companyId;

	@Column(name = "COMPANY_NAME")
	String companyName;

	@ElementCollection()
	List<String> partners = new ArrayList<String>();

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<String> getPartners() {
		return partners;
	}

	public void setPartners(List<String> partners) {
		this.partners = partners;
	}

}
