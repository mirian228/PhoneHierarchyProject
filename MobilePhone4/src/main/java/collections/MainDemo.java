package collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class MainDemo {
	public final static Logger LOGGER = LogManager.getLogger(MainDemo.class);

	public static void main(String[] args) {
		
		//hashset
		Airplane plane = new Airplane();
		plane.addPlane("Boeing 747");
		plane.addPlane("Airbus 1000");
		plane.addPlane("Boeing 737");
		plane.iteratePlane();
		
		//LinkedList
		Animal animal = new Animal();
		animal.addAnimal("Dog");
		animal.addAnimal("Cat");
		animal.addAnimal("Cow");
		LOGGER.info(animal.checkForAnimal("Dog"));
		
		
		
	}

}
