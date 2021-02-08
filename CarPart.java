package _car;



public class CarPart implements Functional  {
	/*
	 * Every class representing a car part should inherit from a superclass called
	 * "CarPart." The CarPart class will have at least the following states and
	 * behaviors: condition - an integer that represents the remaining durability of
	 * the part (starts at 100, goes down to 0 when the part is broken) status() - a
	 * method that prints the condition of the part to the console.
	 */

	int condition = 100;

	public CarPart() {
	}

	/*
	 * The CarPart class should also implement a Functional interface, which
	 * declares a method "function()".
	 */

	public void function() {
	
	}

	/* status() - a method that prints the condition of the part to the car part. */

	public void status() {

		for (int i = 0; i < condition; --condition) {

			if (i < condition) {

				condition--;

				System.out.println("Running at current condition:" + " " + condition);
			} else if (condition == 0) {

				System.out.println("Check dash board gauges");
			}
		}

	}

}
