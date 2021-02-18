package com.learning.java8;

public class MultipleInherticance {

}

interface Moveable {
	void moveIt();
}

interface Spherical {
	void doSphericalThing();
}

interface Bounceable extends Moveable, Spherical{
	void bounce();
	void setBounceFactor(int bf);
}

class Ballnew implements Bounceable{

	@Override
	public void moveIt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSphericalThing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bounce() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBounceFactor(int bf) {
		// TODO Auto-generated method stub
		
	}
	
}