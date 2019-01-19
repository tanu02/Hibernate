package oneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="INSTRUMENT1")
public class Instruments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Instrument_Id")
	int instrumentId;

	@Column(name="Instrument_Name")
	String instrumentname;
	
	@ManyToOne // In the table of Instrument, only the primary key of Musician will appear
	@JoinColumn(name="Musician_Id") // and we are naming it as 
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
