import java.util.HashMap;
import java.util.Map;

public class Train_Consist_Management {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("=======================================\n");

        // HashMap stores key-value pairs (Bogie -> Capacity)
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // ---- INSERT BOGIE CAPACITIES ----
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 78);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo", 100); // Example load capacity

        // ---- DISPLAY BOGIE CAPACITIES ----
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}