package abstraction;

public class Parrot extends Bird {

	public Parrot(String color, String name) {
		super(color, name);
	}

	public void fly() {
		System.out.println(name + " bird  is flying and color of the bird is " + color);
	}

}
