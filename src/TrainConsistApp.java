import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
        return name + "(" + capacity + ")";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC9 - Group Bogies by Type ");
        System.out.println("=======================================\n");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 56));

        System.out.println("Original Bogie List:\n");

        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }

        // Group bogies by name/type
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("\nGrouped Bogies:\n");

        // Display grouped structure
        groupedBogies.forEach((type, bogieList) -> {
            System.out.println(type + " -> " + bogieList);
        });

        System.out.println("\nUC9 grouping completed...");
    }
}