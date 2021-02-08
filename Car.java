package _car;

import java.util.ArrayList;
import java.util.List;
/*
 * Make sure that your Car class creates an instance of each CarPart subclass,
 * as part of its constructor. These instances should be added to a collection
 * of CarPart reference variables.
 */

public class Car implements Functional {

	ArrayList<CarPart> parts = new ArrayList<CarPart>();

	public Car() {
		CarPart tirePart = new Tires();
		Fuel fuelPart = new Fuel();
		Engine enginePart = new Engine();
		parts.add(tirePart);
		parts.add(fuelPart);
		parts.add(enginePart);
	}

	public void run() {
		for (CarPart c : parts) {
			c.status();
			c.function();
		}

		return;

	}

	
	public void function() {
		
		
	}

}
