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

        System.out.println(nums.containsKey("India"));
        System.out.println(nums.containsValue("London"));
        System.out.println(nums.keySet());
        System.out.println(nums.values());
        System.out.println(nums.size());
    }
}
