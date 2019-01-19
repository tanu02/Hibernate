package query;

import java.io.Serializable;

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

	static void commitSession() {
		// insertion is called on commit
		session.getTransaction().commit();
	}

	static void saveSession(Object obj) {
		session.save(obj);
	}

	static void closeSession() {
		session.close();
	}

	@SuppressWarnings("unchecked")
	static <T, V> T get(T key, Serializable id) {
		return (T) session.get(key.getClass(), id);
	}
}
