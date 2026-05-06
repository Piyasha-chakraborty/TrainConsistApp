import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes ");
        System.out.println("==========================================\n");

        // Sample inputs
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainRegex = Pattern.compile(trainPattern);
        Pattern cargoRegex = Pattern.compile(cargoPattern);

        // Create matchers
        Matcher trainMatcher = trainRegex.matcher(trainId);
        Matcher cargoMatcher = cargoRegex.matcher(cargoCode);

        // Validate Train ID
        if (trainMatcher.matches()) {
            System.out.println("Valid Train ID : " + trainId);
        } else {
            System.out.println("Invalid Train ID : " + trainId);
        }

        // Validate Cargo Code
        if (cargoMatcher.matches()) {
            System.out.println("Valid Cargo Code : " + cargoCode);
        } else {
            System.out.println("Invalid Cargo Code : " + cargoCode);
        }

        System.out.println("\nUC11 regex validation completed...");
    }
}