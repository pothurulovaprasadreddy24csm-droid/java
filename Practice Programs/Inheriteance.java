package oop.java;



  class A {



	void add() {



		System.out.println("This is from class A:");



	}

}



class B extends A {



	void sub() {



		System.out.println("This is from class B:");



	}

}



public class Inheriteance {

	public static void main(String[] args) {



		B b = new B();

		b.add();

		b.sub();



	}

}
