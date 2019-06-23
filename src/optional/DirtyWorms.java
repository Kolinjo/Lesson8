package optional;
import java.util.ArrayList;

public class DirtyWorms {
	
	public static void main(String[] args) {

		class Stuff {}
		class Worm extends Stuff {}
		class Dirt extends Stuff {}
		ArrayList<Stuff> stuffIFoundInTheYard = new ArrayList<Stuff>();
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());

		System.out.println(stuffIFoundInTheYard.size());

		/* TODO: Clean out the dirt but keep the delicious worms. */ 
		
		for (int i = 0; i < stuffIFoundInTheYard.size(); i++) {
			if (stuffIFoundInTheYard.get(i).getClass().getSimpleName().equals("Dirt")) {
				stuffIFoundInTheYard.remove(i);
				System.out.println("Dirt");
				i--;
			}else {
				System.out.println("Worm");
			}
			
		}

		System.out.println(stuffIFoundInTheYard.size());	//should be 2

	}
}

