import java.util.ArrayList;
import java.util.List;

public class Train_Consist_Management {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("   === UC2 - Add Passenger Bogies to Train ===");
        System.out.println("==================================================\n");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // --- CREATE (Add bogies) ---
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after addition
        System.out.println("Passenger bogies after addition:");
        System.out.println(passengerBogies);

        // --- DELETE (Remove a bogie) ---
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println(passengerBogies);

        // --- READ (Check existence) ---
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\n'Sleeper' bogie is present in the train.");
        } else {
            System.out.println("\n'Sleeper' bogie is NOT present in the train.");
        }

        // Final state of the list
        System.out.println("\nFinal passenger bogie list:");
        System.out.println(passengerBogies);

        // Program continues...
    }
}