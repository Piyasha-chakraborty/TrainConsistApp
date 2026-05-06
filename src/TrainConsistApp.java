public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println(" UC16 - Bubble Sort Passenger Bogie Capacities ");
        System.out.println("=================================================\n");

        // Array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");

        for (int value : capacities) {
            System.out.print(value + " ");
        }

        // Bubble Sort Logic
        for (int i = 0; i < capacities.length - 1; i++) {

            for (int j = 0; j < capacities.length - i - 1; j++) {

                // Compare adjacent values
                if (capacities[j] > capacities[j + 1]) {

                    // Swap values
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\nAfter Sorting:");

        for (int value : capacities) {
            System.out.print(value + " ");
        }

        System.out.println("\n\nUC16 bubble sort completed...");
    }
}