package sample.java;

public class Method {

	void addition() {
		int x = 3, y = 6;
		System.out.println("Sum is :" + (x + y));
	}

	public static void main(String[] args) {
		System.out.println("Sample");
		Method m = new Method();
		m.addition();
	}
}
	
