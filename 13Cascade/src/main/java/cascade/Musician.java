package cascade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "MUSICIANS")
public class Musician {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Musician_Id")
	int id;

	@Column(name = "Musician_Name")
	String name;

	// -------------------------------------------------

	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "MUSICIANS_TO_INSTRUMENTS", joinColumns = @JoinColumn(name = "MusicianId"), inverseJoinColumns = @JoinColumn(name = "InstrumentId"))
	private List<Instruments> instrumentsList = new ArrayList<Instruments>();

	// -------------------------------------------------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Instruments> getInstrumentsList() {
		return instrumentsList;
	}

	public void setInstrumentsList(List<Instruments> instrumentsList) {
		this.instrumentsList = instrumentsList;
	}
}
