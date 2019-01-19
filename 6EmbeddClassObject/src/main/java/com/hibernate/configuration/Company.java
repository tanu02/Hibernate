package com.hibernate.configuration;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPANY")
public class Company {

	@Id
	@Column(name = "COMPANY_ID")
	String companyId;

	@Column(name = "COMPANY_NAME")
	String companyName;

	@AttributeOverrides({
			@AttributeOverride(name = "headCounts", column = @Column(name = Utils.Department.SALES_HEADCOUNT)),
			@AttributeOverride(name = "description", column = @Column(name = Utils.Department.SALES_DESCRIPTION)) })
	Department salesDep;

	@AttributeOverrides({
			@AttributeOverride(name = "headCounts", column = @Column(name = Utils.Department.OPERATIONS_HEADCOUNT)),
			@AttributeOverride(name = "description", column = @Column(name = Utils.Department.OPERATIONS_DESCRIPTION)) })
	Department operationsDep;

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Department getSalesDep() {
		return salesDep;
	}

	public void setSalesDep(Department salesDep) {
		this.salesDep = salesDep;
	}

	public Department getOperationsDep() {
		return operationsDep;
	}

	public void setOperationsDep(Department operationsDep) {
		this.operationsDep = operationsDep;
	}

}
