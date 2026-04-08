import java.util.HashSet;
import java.util.Set;

public class Train_Consist_Management {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("=======================================\n");

        // Create a Set to store unique bogie IDs
        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (Including Duplicates) ----
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (will be ignored)
        bogies.add("BG101"); // Duplicate
        bogies.add("BG102"); // Duplicate

        // ---- DISPLAY UNIQUE BOGIE IDs ----
        System.out.println("Unique Bogie IDs in Train:");
        for (String bogie : bogies) {
            System.out.println(bogie);
        }
    }
}