class Reservation {

    private int seats = 100;

    void reserve(String name, int required) {

        synchronized (this) {

            System.out.println(name +
                    " requested " + required + " seats.");

            if (required <= seats) {

                System.out.println(name + " is booking...");

                seats -= required;

                System.out.println(name +
                        " booked " + required + " seats.");

                System.out.println("Remaining seats: " + seats);

            } else {

                System.out.println(name +
                        " - Seats not available.");
            }

            System.out.println();
        }
    }
}

class Person extends Thread {

    Reservation r;
    String name;
    int seats;

    Person(Reservation r, String name, int seats) {

        this.r = r;
        this.name = name;
        this.seats = seats;
    }

    public void run() {
        r.reserve(name, seats);
    }
}

public class ReservationSystem {

    public static void main(String[] args) {

        Reservation r = new Reservation();

        Person p1 = new Person(r, "Person A", 35);
        Person p2 = new Person(r, "Person B", 25);
        Person p3 = new Person(r, "Person C", 30);
        Person p4 = new Person(r, "Person D", 20);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}
