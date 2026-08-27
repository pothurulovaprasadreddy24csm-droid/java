// ============================================================
// 1. SINGLE INHERITANCE
// ============================================================

// Parent class
class Fruit {
    void eat() {
        System.out.println("Fruit is eaten");
    }
}

// Apple inherits from only one parent class: Fruit
class Apple extends Fruit {
    void bite() {
        System.out.println("An apple a day keeps the doctor away");
    }
}


// ============================================================
// 2. MULTILEVEL INHERITANCE
// ============================================================

// Fruit -> Apple -> Orange
// Orange inherits properties from Apple and indirectly from Fruit.

class Orange extends Apple {
    void juice() {
        System.out.println("Orange gives juice");
    }
}

// ============================================================
// 3. HIERARCHICAL INHERITANCE
// ============================================================

// Multiple child classes inherit from the same parent class.
// Here, Lion and Cat both inherit from Animal.

class Watermelon extends Fruit {
    void colour() {
        System.out.println("Watermelon is green outside and red inside");
    }
}


// ============================================================
// 4. MULTIPLE INHERITANCE USING INTERFACES
// ============================================================

// Java does NOT allow:
// class C extends A, B
//
// This is because it can create ambiguity (Diamond Problem).
//
// Instead, Java allows a class to implement multiple interfaces.

interface Father {
    void fatherProperty();
}

interface Mother {
    void motherProperty();
}

// Child implements two interfaces.
// Therefore, it gets features from both Father and Mother.
class Child implements Father, Mother {

    public void fatherProperty() {
        System.out.println("Property inherited from Father");
    }

    public void motherProperty() {
        System.out.println("Property inherited from Mother");
    }
}


// ============================================================
// MAIN CLASS
// ============================================================

public class Main {
    public static void main(String[] args) {

        // ---------------- SINGLE INHERITANCE ----------------
        Apple a = new Apple();

        // eat() is inherited from Fruit
        a.eat();

        // bite() belongs to Apple
        a.bite();

          System.out.println("--------------------------------------------------");

        // ---------------- MULTILEVEL INHERITANCE ----------------
        Orange o = new Orange();

        // eat() comes from Fruit
        o.eat();

        // juice() comes from Orange
        o.juice();

         System.out.println("--------------------------------------------------");

        // ---------------- HIERARCHICAL INHERITANCE ----------------
        Watermelon w = new Watermelon();

        // eat() is inherited from Fruit  
        w.eat();

        // colour() belongs to Watermelon
        w.colour();
        
         System.out.println("--------------------------------------------------");

        // ---------------- MULTIPLE INHERITANCE ----------------
        Child ch = new Child();

        // Child gets methods from both interfaces
        ch.fatherProperty();
        ch.motherProperty();
    }
}