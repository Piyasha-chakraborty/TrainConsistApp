import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        System.out.println("==============================================");
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("==============================================\n");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Second Seating", 80));

        System.out.println("Original Bogie List:\n");

        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }

        // Filter bogies with capacity greater than 60
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):\n");

        for (Bogie bogie : filteredBogies) {
            System.out.println(bogie);
        }

        System.out.println("\nUC8 stream filtering completed...");
    }
}