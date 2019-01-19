package oneToOne;

public class OneToOne {
	public static void main(String[] args) {
		SessionWrapper.openSession();
		SessionWrapper.beginTransaction();

		Musician mus = createMusician();
		Instruments inst = createInstrument("Guitar");
		mus.setInstrument(inst);

		SessionWrapper.saveSession(mus);
		SessionWrapper.saveSession(inst);

		SessionWrapper.commitSession();
		SessionWrapper.closeSession();
	}

	static Musician createMusician() {
		Musician mus = new Musician();
		mus.setName("Slash");
		return mus;
	}

	static Instruments createInstrument(String instName) {
		Instruments inst = new Instruments();
		inst.setInstrumentname(instName);
		return inst;
	}
}
