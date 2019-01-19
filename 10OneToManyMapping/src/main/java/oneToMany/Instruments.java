package oneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "INSTRUMENT")
public class Instruments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Instrument_Id")
	int instrumentId;

	@Column(name = "Instrument_Name")
	String instrumentname;

	@ManyToOne
	@JoinColumn(name = "Musician_Id")
	Musician musician;

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

	public Musician getMusician() {
		return musician;
	}

	public void setMusician(Musician musician) {
		this.musician = musician;
	}

}
