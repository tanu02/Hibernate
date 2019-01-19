package com.hibernate.configuration;

public class App {

	public static void main(String[] args) {

		Location loc = new Location();
		LocationId locId = new LocationId();
		locId.setCountry("India");
		locId.setState("Indore");

		loc.setLocId(locId);

		SessionWrapper.openSession();
		SessionWrapper.beginTransaction();
		SessionWrapper.saveObject(loc);
		SessionWrapper.commitTransaction();
		SessionWrapper.closeSession();
	}
}
