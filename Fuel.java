package _car;

public class Fuel extends CarPart {

	public Fuel() {
	};

	public void status() {
		
		super.status();
		
		if (condition == 0) {

			System.out.println("Gas is empty");
		}
	}
	
	public void funtion() {

		System.out.println("12 gallon tank");
	}
}
