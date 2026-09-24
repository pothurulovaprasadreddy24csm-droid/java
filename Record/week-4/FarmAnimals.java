class FarmAnimal {
    String name;
    String stays;
    String eats;
    String sound;

    // Constructor
    FarmAnimal(String name, String stays, String eats, String sound) {
        this.name = name;
        this.stays = stays;
        this.eats = eats;
        this.sound = sound;
    }

    // Method to display animal details
    void displayDetails() {
        System.out.println("Animal : " + name);
        System.out.println("Stays  : " + stays);
        System.out.println("Eats   : " + eats);
        System.out.println("Sound  : " + sound);
        System.out.println("----------------------");
    }
}

public class FarmAnimals {
    public static void main(String[] args) {

        // Creating objects
        FarmAnimal cow = new FarmAnimal(
            "Cow", "Cowshed", "Grass and Hay", "Moo"
        );

        FarmAnimal pig = new FarmAnimal(
            "Pig", "Pigsty", "Grains and Vegetables", "Oink"
        );

        FarmAnimal horse = new FarmAnimal(
            "Horse", "Stable", "Grass and Hay", "Neigh"
        );

        // Displaying details
        cow.displayDetails();
        pig.displayDetails();
        horse.displayDetails();
    }
}
