import java.util.LinkedHashSet;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("==========================================\n");

        // Create LinkedHashSet
        // Maintains insertion order and prevents duplicates

        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Add duplicate bogie intentionally
        trainFormation.add("Sleeper");

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);

        System.out.println("\nNote:");
        System.out.println("Duplicate bogies are automatically ignored.");

        System.out.println("\nUC5 insertion order preservation completed...");
    }
}