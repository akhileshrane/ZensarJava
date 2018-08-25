package Human;


public abstract class Human {
	abstract void walk();
	abstract void talk();
	public abstract void think();
	
}



abstract class Architect extends Human implements MathGenius,Artist {
	public void talk() {
	}
}