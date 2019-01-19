package oneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "INSTRUMENT")
public class Instruments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Instrument_Id")
	int instrumentId;

	@Column(name = "Name")
	String instrumentname;

	public int getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(int instrumentId) {
		this.instrumentId = instrumentId;
	}

	public String getInstrumentname() {
		return instrumentname;
	}

	public void setInstrumentname(String instrumentname) {
		this.instrumentname = instrumentname;
	}
}
