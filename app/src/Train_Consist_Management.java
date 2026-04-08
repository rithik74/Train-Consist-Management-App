import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Train_Consist_Management {

    // Inner Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC7 - Sort Bogies by Capacity ");
        System.out.println("=======================================\n");

        // Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        // ---- ADD BOGIES ----
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // ---- DISPLAY BEFORE SORTING ----
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // ---- SORT USING COMPARATOR ----
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // ---- DISPLAY AFTER SORTING ----
        System.out.println("\nAfter Sorting (By Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
    }
}