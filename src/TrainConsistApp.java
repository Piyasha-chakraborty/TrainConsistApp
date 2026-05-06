public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("=================================================\n");

        // Empty bogie collection
        String[] bogieIds = {};

        // Search key
        String searchKey = "BG101";

        try {

            // State validation
            if (bogieIds.length == 0) {

                throw new IllegalStateException(
                        "Cannot perform search. No bogies available in the train."
                );
            }

            // Search logic
            boolean found = false;

            for (String id : bogieIds) {

                if (id.equals(searchKey)) {

                    found = true;
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

        } catch (IllegalStateException e) {

            System.out.println("Exception Caught:");
            System.out.println(e.getMessage());
        }

        System.out.println(
                "\nUC20 defensive validation completed..."
        );
    }
}