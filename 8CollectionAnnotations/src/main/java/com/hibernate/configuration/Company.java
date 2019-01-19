package com.hibernate.configuration;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "COMPANY")
public class Company {

	@Id
	@Column(name = "COMPANY_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int companyId;

	@Column(name = "COMPANY_NAME")
	String companyName;

	@GenericGenerator(name = "use-hilo", strategy = "increment") // strategy to generate primary key

	@CollectionId(columns = { @Column(name = "PARTNER_ID") }, generator = "use-hilo", type = @Type(type = "long")) 
	//ColumnName					// strategy					// DataType									

	@JoinTable(name = "COMPANY_PARTNERS", // TableName of Collection table
	joinColumns = @JoinColumn(name = "COMPANY_ID") // ColumnName Foreign key
			)
	@ElementCollection()
	@Column(name = "PARTNER_NAME")
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
