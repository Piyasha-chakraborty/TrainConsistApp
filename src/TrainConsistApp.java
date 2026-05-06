import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {

    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> Capacity: " + capacity;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC7 - Sort Bogies by Capacity ");
        System.out.println("======================================\n");

        // Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("Before Sorting:\n");

        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }

        // Sort using Comparator
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting By Capacity:\n");

        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }

        System.out.println("\nUC7 sorting completed...");
    }
}