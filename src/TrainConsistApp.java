import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {

    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> Capacity: " + capacity;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("=================================================\n");

        // Create dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {

            bogies.add(new Bogie("Bogie-" + i, i % 100));
        }

        // ---------------- LOOP BASED FILTERING ----------------

        long loopStart = System.nanoTime();

        List<Bogie> loopFiltered = new ArrayList<>();

        for (Bogie bogie : bogies) {

            if (bogie.capacity > 60) {

                loopFiltered.add(bogie);
            }
        }

        long loopEnd = System.nanoTime();

        long loopTime = loopEnd - loopStart;

        // ---------------- STREAM BASED FILTERING ----------------

        long streamStart = System.nanoTime();

        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();

        long streamTime = streamEnd - streamStart;

        // Display Results

        System.out.println("Loop Filter Result Count : "
                + loopFiltered.size());

        System.out.println("Loop Execution Time : "
                + loopTime + " ns\n");

        System.out.println("Stream Filter Result Count : "
                + streamFiltered.size());

        System.out.println("Stream Execution Time : "
                + streamTime + " ns");

        System.out.println("\nUC13 benchmarking completed...");
    }
}
