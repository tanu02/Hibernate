package query;

import java.util.List;

public class App {
	static RepoTicketStatus repo = new RepoTicketStatus();

	public static void main(String[] args) {

		SessionWrapper.openSession();
		SessionWrapper.beginTransaction();
		// Insertion--------------------------------------------------

		TrainDetails tDetail = new TrainDetails();
		tDetail.setId(4444);
		tDetail.setName("Overnight");

		TicketStatus ticketStatus = new TicketStatus();
		ticketStatus.setPnr("abc123");
		ticketStatus.settDetail(tDetail);

		SessionWrapper.saveSession(ticketStatus);
		SessionWrapper.commitSession();
		// Retrieval---------------------------------------------------

		// printTicketStatus(repo.getPnrQuery1());
		// loopTrain(repo.getPnrQuery2());

		// printTicketStatus(repo.conditionalQuery("", 4444));
		// printTicketStatus(repo.criteriaQuery("Overnight", 4444));

		printTicketStatus(repo.namedQuery("getTicketStatus", "abc123"));
		printTicketStatus(repo.namedNativeQuery("getTicketStatusNative", "abc123"));
		SessionWrapper.closeSession();

	}

	static void printTrainDetails(TrainDetails tDetails) {
		System.out.println("Train Id " + tDetails.id);
		System.out.println("Train Name " + tDetails.name);
	}

	static void loopTrain(List<TrainDetails> list) {
		list.forEach(train -> printTrainDetails(train));
	}

	static void printTicketStatus(List<TicketStatus> list) {
		list.forEach(status -> System.out.println("Pnr " + status.getPnr()));
		list.forEach(status -> printTrainDetails(status.gettDetail()));
		System.out.println();
	}
}