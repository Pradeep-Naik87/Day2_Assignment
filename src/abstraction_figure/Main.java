package abstraction_figure;

public class Main {

	public static void main(String[] args) {

		Figure t = new Triangle(4, 5);
		System.out.println(t.area());

		Figure r = new Rectangle(4, 5);
		System.out.println(r.area());
	}

}
