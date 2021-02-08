package _car;

public class Engine extends CarPart {
	public Engine() {
	}

	public void status() {
		super.status();
		if (condition == 0) {

			System.out.println("Engine needs service");
		}
	}

	public void function() {

		System.out.println("The engine has 12 cylinders");
	}
}
