import java.util.LinkedHashSet;
import java.util.Set;

public class Train_Consist_Management {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("=======================================\n");

        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // ---- ADD BOGIES ----
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // ---- ADD DUPLICATE ----
        formation.add("Sleeper"); // Duplicate (ignored)

        // ---- DISPLAY FINAL FORMATION ----
        System.out.println("Final Train Formation:");
        for (String bogie : formation) {
            System.out.println(bogie);
        }
    }
}