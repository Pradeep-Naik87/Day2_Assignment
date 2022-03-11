package abstraction;

public class Duck extends Bird {
	public Duck(String color, String name) {
		super(color, name);
	}

	public void fly() {
		System.out.println(name + " bird  is flying and color of the bird is " + color);

	}
}
