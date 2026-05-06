import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC6 - Map Bogie to Capacity ");
        System.out.println("======================================\n");

        // Create HashMap
        // Key = Bogie Name
        // Value = Capacity

        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Add bogie capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 54);
        bogieCapacityMap.put("First Class", 24);

        System.out.println("Bogie Capacity Details:\n");

        // Iterate using entrySet()
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> Capacity: " + entry.getValue()
            );
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}