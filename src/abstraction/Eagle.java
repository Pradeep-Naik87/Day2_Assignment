package abstraction;

public class Eagle extends Bird {
	public Eagle(String color, String name) {
		super(color, name);
	}

	public void fly() {
		System.out.println(name + " bird  is flying and color of the bird is " + color);
	}
}
