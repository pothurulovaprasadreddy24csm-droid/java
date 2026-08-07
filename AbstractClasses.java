package oop.java;

abstract class C1 {

	int price;

	String name;

	C1(String name, int price) {
		this.price = price;
		this.name = name;

	}

	abstract void carPrice();

	void display() {

		System.out.println("Car brand : " + name);

		System.out.println("Price : " + price);

	}

}

public class AbstractClasses extends C1 {

	AbstractClasses(String name, int price) {

		super(name, price);

	}

	@Override

	void carPrice() {

		System.out.print("Car price is : " + price);

	}

	public static void main(String[] args) {

		AbstractClasses ac = new AbstractClasses("Audi", 30000000);

		ac.display();

		ac.carPrice();

	}

}
