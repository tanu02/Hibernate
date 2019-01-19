package cascade;

public class ManyToMany {
	public static void main(String[] args) {
		SessionWrapper.openSession();
		SessionWrapper.beginTransaction();

		Musician mus1 = createMusician("Slash");
		Instruments inst2 = createInstrument("Guitar");
		Instruments inst1 = createInstrument("Bass");
		mus1.getInstrumentsList().add(inst1);
		mus1.getInstrumentsList().add(inst2);

		Musician mus2 = createMusician("Joe");
		Instruments inst3 = createInstrument("Drums");
		Instruments inst4 = createInstrument("Bongo");
		mus2.getInstrumentsList().add(inst3);
		mus2.getInstrumentsList().add(inst4);

		SessionWrapper.persistSession(mus1);
		SessionWrapper.persistSession(mus2);

		SessionWrapper.commitSession();
		SessionWrapper.closeSession();
	}

	static Musician createMusician(String name) {
		Musician mus = new Musician();
		mus.setName(name);
		return mus;
	}

	static Instruments createInstrument(String instName) {
		Instruments inst = new Instruments();
		inst.setInstrumentname(instName);
		return inst;
	}
}
