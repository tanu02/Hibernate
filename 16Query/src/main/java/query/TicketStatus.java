package query;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "TICKET_STATUS")
@NamedQuery(query = "from TicketStatus where pnr = :name", name = "getTicketStatus")
@NamedNativeQuery(name = "getTicketStatusNative", query = "select * from TICKET_STATUS where pnr = ?", resultClass = TicketStatus.class)
public class TicketStatus {
	@Id
	String pnr;

	@Embedded
	TrainDetails tDetail = new TrainDetails();

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public TrainDetails gettDetail() {
		return tDetail;
	}

	public void settDetail(TrainDetails tDetail) {
		this.tDetail = tDetail;
	}

}
