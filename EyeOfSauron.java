import java.util.*;

public class EyeOfSauron extends Observable {
	
	private int hobbits, elves, dwarves, men;
	private BadGuy badguy;
	
	public EyeOfSauron()
	{
		
	}
	
	public void setEnemies(int h, int e, int d, int m)
	{
		this.hobbits = h;
		this.elves = e;
		this.dwarves = d;
		this.men = m;
		
		setChanged();
		notifyObservers();
		
	}
	
	public void somethingChanged()
	{
		setChanged();
		notifyObservers();
	}
	
	public int getHobbits()
	{
		return this.hobbits;
	}
	
	public int getElves()
	{
		return this.elves;
	}
	
	public int getDwarves()
	{
		return this.dwarves;
	}
	
	public int getMen()
	{
		return this.men;
	}
}
