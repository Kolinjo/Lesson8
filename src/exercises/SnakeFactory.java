package exercises;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;


public class SnakeFactory extends Snake  {
	
	public SnakeFactory(boolean venomous) {
		super();
	}


	private static List<Snake>snakes = new ArrayList<Snake>();
	

	public static List<Snake> createListOfSnakes (){
		
		
		boolean venomous = new Random().nextBoolean();
		
		for (int i = 0; i < 5; i++) {
			snakes.add(new Snake());	
			
		}
		
		return snakes;
	}
	

}
