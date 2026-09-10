// PART A and B: Classes, Objects, Constructors,Encapsulation
class Book{
  private int bookID;
  private String bookname;
  private String author;
  private double price;

// Default constructor
Book() {
  bookID = 0;
  bookname = "Unknown";
  author = "Unknown";
  price = 0.0;
}

// Parameterized constructor
Book(int bookID, String bookname, String author, double price) {
  this.bookID = bookID;
  this.bookname = bookname;
  this.author = author;
  this.price = price;
  } 

// Getters and Setters
int getbookID() {
  return bookID;
  }
void setbookID(int bookID) {
  this.bookID = bookID;
  }

String getbookname() {
  return bookname;
  }
void setbookname(String bookname) {
  this.bookname = bookname;
  }

String getauthor() {
  return author;
  }
void setauthor(String author) {
  this.author = author;
  }

double getprice() {
  return price;
  }
void setprice(double price) {
  this.price = price;
  }

// Display book details
void displayBook() {
  System.out.println("Book ID   : " + bookID);
  System.out.println("Book Name : " + bookname);
  System.out.println("Author    : " + author);
  System.out.println("Price     : " + price);
  }
}

// PART C: INHERITANCE
class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
    }

  void displayPerson() {
    System.out.println("Name : " + name);
    System.out.println("Age  : " + age);
    }
}

// Student inherits Person
class Student extends Person {
  int rollNo;

  Student(String name, int age, int rollNo) {
    super(name, age);
    this.rollNo = rollNo;
    }

  void displayStudent() {
    displayPerson();
    System.out.println("Roll No : " + rollNo);
    }
}

// Faculty inherits Person
class Faculty extends Person {
  String subject;

  Faculty(String name, int age, String subject) {
    super(name, age);
    this.subject = subject;
    }

  void displayFaculty() {
    displayPerson();
    System.out.println("Subject : " + subject);
    }
}

// PART D: POLYMORPHISM
// Method Overloading
class Area {

  // Area of square
  double calculateArea(double side) {
    return side * side;
  }

  // Area of rectangle
  double calculateArea(double length, double breadth) {
    return length * breadth;
  }

  // Area of circle
  double calculateArea(float radius) {
    return 3.14 * radius * radius;
  }
}

// Method Overriding
class Vehicle {
  void display() {
    System.out.println("This is a Vehicle");
  }
}

class Car extends Vehicle {
  @Override
  void display() {
    System.out.println("This is a Car");
  }
}

class Bike extends Vehicle {
  @Override
  void display() {
    System.out.println("This is a Bike");
  }
}

// PART E: ABSTRACTION
abstract class Shape {

  // Abstract method
  abstract void draw();
}

class Circle extends Shape {

  @Override
  void draw() {
    System.out.println("Drawing a Circle");
  }
}

class Rectangle extends Shape {
  @Override
  void draw() {
    System.out.println("Drawing a Rectangle");
  }
}

// INTERFACE
interface Printable {
    void print();
}

class Report implements Printable {

  @Override
  public void print() {
    System.out.println("Printing Library Report");
    }
}

public class LibraryManagementSystem {
  public static void main(String[] args) {

// PART A + B: Book Objects
System.out.println("===== BOOK DETAILS =====");

  // Object using parameterized constructor
  Book b1 = new Book(101, "Java Programming","Santhosh", 500);
  b1.displayBook();
  System.out.println();

  // Object using default constructor
  Book b2 = new Book();

  // Using setters
  b2.setbookID(102);
  b2.setbookname("Data Structures");
  b2.setauthor("Ganga Parvathi");
  b2.setprice(450);

  b2.displayBook();

  // Using getters
  System.out.println("\nBook Name using Getter: "+ b1.getbookname());

// PART C: Inheritance
System.out.println("\n===== INHERITANCE =====");

  Student s = new Student("Avinash", 20, 106);
  s.displayStudent();

  System.out.println();

  Faculty f = new Faculty("Dr.James", 40,"Computer Science");
  f.displayFaculty();

// PART D: Method Overloading
System.out.println("\n===== METHOD OVERLOADING =====");

  Area a = new Area();

  System.out.println("Area of Square: "+ a.calculateArea(5.0));

  System.out.println("Area of Rectangle: "+ a.calculateArea(5.0, 4.0));

  System.out.println("Area of Circle: "+ a.calculateArea(3.0f));  

// PART D: Method Overriding
System.out.println("\n===== METHOD OVERRIDING =====");

  Vehicle v1 = new Car();
  Vehicle v2 = new Bike();

  v1.display();
  v2.display();
  
// PART E: Abstraction
System.out.println("\n===== ABSTRACTION =====");

  Shape c = new Circle();
  Shape r = new Rectangle();

  c.draw();
  r.draw();

// PART E: Interface
 System.out.println("\n===== INTERFACE =====");

  Report report = new Report();
  report.print();
  }
}