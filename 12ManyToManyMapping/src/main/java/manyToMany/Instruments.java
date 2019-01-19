package manyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name = "INSTRUMENTS")
public class Instruments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Instrument_Id")
	int instrumentId;

	@Column(name = "Instrument_Name")
	String instrumentname;

	// --------------------------------------------------------
	@ManyToMany(mappedBy = "instrumentsList")
	List<Musician> musiciansList = new ArrayList<Musician>();

	// --------------------------------------------------------
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

	public List<Musician> getMusician() {
		return musiciansList;
	}

	public void setMusician(List<Musician> musician) {
		this.musiciansList = musician;
	}
}
