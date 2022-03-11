package abstraction;

public class Main {

	public static void main(String[] args) {
		Bird b1 = new Parrot("Green", "Parrot");
		b1.fly();

		Bird b2 = new Eagle("brown", "Eagle");
		b2.fly();

		Bird b3 = new Duck("white", "Duck");
		b3.fly();
	}

}
