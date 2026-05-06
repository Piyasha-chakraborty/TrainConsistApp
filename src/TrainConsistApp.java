import java.util.Arrays;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println(" UC17 - Sort Bogie Names Using Arrays.sort() ");
        System.out.println("=================================================\n");

        // Array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Display before sorting
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        // Display after sorting
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 sorting completed...");
    }
}