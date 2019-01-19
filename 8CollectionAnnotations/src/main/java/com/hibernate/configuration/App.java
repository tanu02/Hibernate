package com.hibernate.configuration;

public class App {

	public static void main(String[] args) {

		Company cmp = new Company();

		cmp.setCompanyName("Apple");
		cmp.getPartners().add("IBM");

		SessionWrapper.openSession();
		SessionWrapper.beginTransaction();
		SessionWrapper.saveObject(cmp);
		SessionWrapper.commitTransaction();
		SessionWrapper.closeSession();
	}
}
