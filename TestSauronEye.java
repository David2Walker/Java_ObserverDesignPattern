
public class TestSauronEye {

	public static void main(String[] args) {
		
		int hobbits, elves, dwarves, men;
		hobbits = 1;
		elves = 1;
		dwarves = 2;
		men = 0;
        EyeOfSauron eye = new EyeOfSauron();
        BadGuy saruman = new BadGuy(eye, "Saruman");
        BadGuy witchKing= new BadGuy(eye, "Witch King");
        eye.setEnemies(hobbits, elves, dwarves, men); //hobbits, elves, dwarves, men -- BTW, this is HORRIBLE coding style
        //message should be displayed from Saruman and Angmar that they know about 1 hobbit, 1 elf, 2 dwarves
        
        saruman.defeated(); //Saruman is no longer registered with the Eye
        
        hobbits = 4;
		elves = 2;
		dwarves = 2;
		men = 100;
        eye.setEnemies(hobbits, elves, dwarves, men);
        //only the Witch King reports on the enemies

    }//end main

}
