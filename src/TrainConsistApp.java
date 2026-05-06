public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("=================================================\n");

        // Array of bogie IDs
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        // Search key
        String searchKey = "BG309";

        boolean found = false;

        // Linear Search
        for (String id : bogieIds) {

            if (id.equals(searchKey)) {

                found = true;

                // Stop search immediately
                break;
            }
        }

        // Display result
        if (found) {

            System.out.println(
                    "Bogie Found : " + searchKey
            );

        } else {

            System.out.println(
                    "Bogie Not Found : " + searchKey
            );
        }

        System.out.println("\nUC18 linear search completed...");
    }
}