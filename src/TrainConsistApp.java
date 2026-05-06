class CargoSafetyException extends RuntimeException {

    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {

    String shape;
    String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    // Cargo assignment method
    public void assignCargo(String cargo) {

        // Unsafe condition
        if (shape.equals("Rectangular")
                && cargo.equals("Petroleum")) {

            throw new CargoSafetyException(
                    "Unsafe Cargo Assignment Detected!"
            );
        }

        this.cargo = cargo;

        System.out.println(
                "Cargo Assigned Successfully: "
                        + cargo + " -> " + shape + " Bogie"
        );
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println(" UC15 - Safe Cargo Assignment Using try-catch ");
        System.out.println("=================================================\n");

        // Safe assignment
        GoodsBogie cylindrical =
                new GoodsBogie("Cylindrical");

        // Unsafe assignment
        GoodsBogie rectangular =
                new GoodsBogie("Rectangular");

        try {

            cylindrical.assignCargo("Petroleum");

            rectangular.assignCargo("Petroleum");

        } catch (CargoSafetyException e) {

            System.out.println("\nException Caught:");
            System.out.println(e.getMessage());

        } finally {

            System.out.println(
                    "\nCargo validation process completed."
            );
        }

        System.out.println(
                "\nApplication continues safely..."
        );
    }
}