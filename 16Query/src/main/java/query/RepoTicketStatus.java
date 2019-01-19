package query;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

public class RepoTicketStatus {

	// select full table using Query class
	public List<TicketStatus> getPnrQuery1() {

		Query q = SessionWrapper.session.createQuery("from TicketStatus");
		List<TicketStatus> pnrList = q.list();
		return pnrList;
	}

	// select only specific column using Query class
	public List<TrainDetails> getPnrQuery2() {

		Query q = SessionWrapper.session.createQuery("select tDetail from TicketStatus");
		List<TrainDetails> pnrList = q.list();
		return pnrList;
	}

	// parameterized query using Query class
	public List<TicketStatus> conditionalQuery(String trainName, int trainNo) {
		trainName += "Overnight";
		Query q = SessionWrapper.session
				.createQuery("from TicketStatus where tDetail.name = :name and tDetail.id = :id");
		// q.setString("name", "Overnight"); //we can use setString or
		q.setParameter("name", trainName);// use setParameter
		q.setParameter("id", trainNo);

		return q.list();
	}

	// parameterized query using Criteria class
	public List<TicketStatus> criteriaQuery(String trainName, int trainNo) {
		Criteria cr = SessionWrapper.session.createCriteria(TicketStatus.class);
		cr.add(Restrictions.eq("tDetail.name", trainName)).add(Restrictions.eq("tDetail.id", trainNo));
		return cr.list();
	}

	// query defined in the annotation. Set variables by their name
	public List<TicketStatus> namedQuery(String queryName, String param) {
		Query qClass = SessionWrapper.session.getNamedQuery(queryName);
		qClass.setParameter("name", param);
		return qClass.list();
	}

	// query defined in the annotation. Set variables by their numeric location
	public List<TicketStatus> namedNativeQuery(String queryName, String param) {
		Query qClass = SessionWrapper.session.getNamedQuery(queryName);
		qClass.setParameter(1, param);
		return qClass.list();
	}
}
