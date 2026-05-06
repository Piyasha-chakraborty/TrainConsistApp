import java.util.ArrayList;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("======================================");

        // Create an ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add bogies to the train
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("\nAfter Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // Remove AC Chair bogie
        passengerBogies.remove("AC Chair");

        // Display bogies after removal
        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // Check if Sleeper exists
        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper : "
                + passengerBogies.contains("Sleeper"));

        // Final list
        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nSystem ready for operations...");
    }
}

