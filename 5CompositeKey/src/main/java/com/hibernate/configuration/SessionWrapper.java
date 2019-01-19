package com.hibernate.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionWrapper {

	static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();;
	static Session session;

	static void openSession() {
		session = sessionFactory.openSession();
	}

	static void beginTransaction() {
		session.beginTransaction();
	}

	static void saveObject(Object obj) {
		session.save(obj);
	}

	static void commitTransaction() {
		// insertion is called on commit
		session.getTransaction().commit();
	}

	static void closeSession() {
		session.close();
	}
}