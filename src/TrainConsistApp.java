import java.util.ArrayList;
import java.util.List;

class GoodsBogie {

    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("=================================================\n");

        // Create goods bogie list
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        System.out.println("Goods Bogie Details:\n");

        for (GoodsBogie bogie : bogies) {
            System.out.println(bogie);
        }

        // Safety validation using stream + allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical")
                                || b.cargo.equals("Petroleum")
                );

        // Display result
        System.out.println("\nSafety Compliance Status:");

        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is UNSAFE.");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}