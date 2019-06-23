package exercises;

import java.util.ArrayList;
import java.util.List;

public class MovieProducer {

	/*
	 * Snakes can be venomous or not. 
	 * A Plane contains a list of snakes. 
	 * How many snakes does Sam have to kill to make the plane safe?
	 */

	public static void main(String[] args) {
		List<Snake> snakes = SnakeFactory.createListOfSnakes();
		Plane plane = new Plane();
		plane.addSnakes(snakes, 1);
		int howManyHasToKill = plane.getNumberOfVenomousSnakes();
		System.out.println("Sam has to kill the right " + howManyHasToKill + " snakes.");
	}
}
