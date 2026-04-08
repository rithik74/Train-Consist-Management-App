import java.util.LinkedList;

class Train_Consist_Management {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("=======================================\n");

        // Create a LinkedList
        // Maintains insertion order and allows fast inserts
        LinkedList<String> trainConsist = new LinkedList<>();

        // ---- ADD BOGIES ----
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // ---- INSERT AT SPECIFIC POSITION ----
        // Insert Pantry Car at position 2 (index 2)
        trainConsist.add(2, "Pantry");

        // ---- REMOVE FIRST AND LAST ----
        trainConsist.removeFirst(); // Removes Engine
        trainConsist.removeLast();  // Removes Guard

        // ---- DISPLAY FINAL CONSIST ----
        System.out.println("Final Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}