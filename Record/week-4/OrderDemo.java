// Customer class
class Customer {
    String name;
    String location;

    void sendOrder() {
        System.out.println(name + " sent the order.");
    }

    void receiveOrder() {
        System.out.println(name + " received the order.");
    }
}

// Order class
class Order {
    String date;
    String number;

    void confirm() {
        System.out.println("Order " + number + " is confirmed.");
    }

    void close() {
        System.out.println("Order " + number + " is closed.");
    }
}

// SpecialOrder inherits Order
class SpecialOrder extends Order {

    void dispatch() {
        System.out.println("Special order " + number + " is dispatched.");
    }
}

// NormalOrder inherits Order
class NormalOrder extends Order {

    void dispatch() {
        System.out.println("Normal order " + number + " is dispatched.");
    }

    void receive() {
        System.out.println("Normal order " + number + " is received.");
    }
}

// Main class
public class OrderDemo {
    public static void main(String[] args) {

        // Creating Customer object
        Customer customer = new Customer();
        customer.name = "Ravi";
        customer.location = "Vizianagaram";

        System.out.println("Customer Details");
        System.out.println("Name     : " + customer.name);
        System.out.println("Location : " + customer.location);
        customer.sendOrder();
        customer.receiveOrder();

        System.out.println();

        // Creating SpecialOrder object
        SpecialOrder special = new SpecialOrder();
        special.date = "18-09-2026";
        special.number = "S101";

        System.out.println("Special Order");
        System.out.println("Date   : " + special.date);
        System.out.println("Number : " + special.number);
        special.confirm();
        special.dispatch();
        special.close();

        System.out.println();

        // Creating NormalOrder object
        NormalOrder normal = new NormalOrder();
        normal.date = "18-09-2026";
        normal.number = "N101";

        System.out.println("Normal Order");
        System.out.println("Date   : " + normal.date);
        System.out.println("Number : " + normal.number);
        normal.confirm();
        normal.dispatch();
        normal.receive();
        normal.close();
    }
}
