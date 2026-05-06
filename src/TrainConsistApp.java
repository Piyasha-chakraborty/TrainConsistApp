import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("==================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("==================================");

        // Create an empty list to store train bogies
        List<String> trainBogies = new ArrayList<>();

        // Display consist summary
        System.out.println("\nTrain initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainBogies.size());
        System.out.println("Current Train Consist : " + trainBogies);

        System.out.println("\nSystem ready for operations...");
    }
}