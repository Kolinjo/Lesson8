package exercises;

import java.util.ArrayList;

import java.util.List;

public class Plane {

	private List<Snake> snakes;
//	SnakeFactory snakeFactory = new SnakeFactory(false);

	public void addSnakes(List<Snake> snakes, int size) {

		for (int i = 0; i < size; i++) {
			snakes.add(new Snake());
		}
	}

	public int getNumberOfVenomousSnakes() {

		int counter = 0;

		snakes = SnakeFactory.createListOfSnakes();
		for (Snake snake : snakes) {
			if (snake.isVenomous()) {
				counter++;

				System.out.println("Total number of venomous snakes is " + counter);

			}
			
		}

		return counter;
	}
}
