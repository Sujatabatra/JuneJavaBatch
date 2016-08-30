package com.sujata.demo;

public class Juggler implements Performer {

	private int balls;
	
	public Juggler(){
		
	}
	public Juggler(int balls) {
		super();
		this.balls = balls;
	}


	@Override
	public void perform() {
		System.out.println("Juggler is juggling "+balls+" balls");

	}

}
