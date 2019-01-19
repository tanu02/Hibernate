package oneToMany;

public class OneToMany 
{
	public static void main( String[] args )
	{
		SessionWrapper.openSession();
		SessionWrapper.beginTransaction();

		Musician mus = createMusician("Slash");
		Instruments inst2 = createInstrument("Guitar");
		Instruments inst1 = createInstrument("Bass");		
		
		mus.getInstrumentsList().add(inst1);
		mus.getInstrumentsList().add(inst2);	
		inst1.setMusician(mus);
		inst2.setMusician(mus);

		SessionWrapper.saveSession(mus);
		SessionWrapper.saveSession(inst1);
		SessionWrapper.saveSession(inst2);

		SessionWrapper.commitSession();
		SessionWrapper.closeSession();
	}

	static Musician createMusician(String name){
		Musician mus = new Musician();
		mus.setName(name);
		return mus;
	}
	static Instruments createInstrument(String instName){
		Instruments inst = new Instruments();
		inst.setInstrumentname(instName);	
		return inst;
	}
}
