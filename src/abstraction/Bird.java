package abstraction;

abstract class Bird {
	protected String color;
	protected String name;

	public Bird(String color, String name) {
		this.color = color;
		this.name = name;
	}

	abstract void fly();

	

}
