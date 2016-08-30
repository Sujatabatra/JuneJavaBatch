package com.sujata.demo;

public class Instrumentalist implements Performer {

	private Instrument instrument;
	
	
	public Instrumentalist(Instrument instrument) {
		super();
		this.instrument = instrument;
	}

	public Instrumentalist() {
	}
	

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perform() {
		System.out.print("Instrumentalist is playing ");
		instrument.play();

	}

}
