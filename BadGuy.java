import java.util.*;

public class BadGuy implements Observer {
	Observable observable;
	String name;
	EyeOfSauron eye;
	private int hobbits, elves, dwarves, men;
	
	public BadGuy(EyeOfSauron eye, String name) {
		this.eye = eye;
		this.name = name;
		eye.addObserver(this);
	}

	public void defeated()
	{
		this.eye.deleteObserver(this);
		System.out.println("Saruman has been defeated.");
	}
	
	
	public void report()
	{
		System.out.println(this.name + " sees " + this.hobbits + " hobbits " +
				+ this.elves + " elves " + this.dwarves + " dwarves " + this.men + " men.");
	}

	
	@Override
	public void update(Observable o, Object arg) {
		eye = (EyeOfSauron) o;
		this.hobbits = eye.getHobbits();
		this.elves = eye.getElves();
		this.dwarves = eye.getDwarves();
		this.men = eye.getMen();
		report();
	}
	

}