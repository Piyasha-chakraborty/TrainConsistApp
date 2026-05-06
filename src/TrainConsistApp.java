class InvalidCapacityException extends Exception {

    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {

    String type;
    int capacity;

    // Constructor with validation
    public PassengerBogie(String type, int capacity)
            throws InvalidCapacityException {

        if (capacity <= 0) {

            throw new InvalidCapacityException(
                    "Capacity must be greater than zero"
            );
        }

        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {

        return type + " -> Capacity: " + capacity;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("=================================================\n");

        try {

            // Valid bogie
            PassengerBogie sleeper =
                    new PassengerBogie("Sleeper", 72);

            System.out.println("Valid Bogie Created:");
            System.out.println(sleeper);

            // Invalid bogie
            PassengerBogie invalid =
                    new PassengerBogie("AC Chair", 0);

            System.out.println(invalid);

        } catch (InvalidCapacityException e) {

            System.out.println("\nException Caught:");
            System.out.println(e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}