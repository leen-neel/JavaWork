import java.util.HashMap;
import java.util.Map;

public class ArrayList {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        Map<String, String> nums = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        nums.put("India", "Delhi");
        nums.put("USA", "Washington");
        nums.put("Bangladesh", "Dhaka");
        nums.put("China", "Beinjing");

        System.out.println(nums.values());

    }
}
