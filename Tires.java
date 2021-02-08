package _car;

public class Tires extends CarPart {

	public Tires() {
	};

	public void status() {
		super.status();
		if (condition == 0) {

			System.out.println("Tire needs service");
		}
	}
	
	public void function() {
		System.out.println("Tires are size 205/30/16 ");
	}
}
