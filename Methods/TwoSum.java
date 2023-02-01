import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    
    public static int[] twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> differences = new HashMap<>();
       
        for (int i = 0; i < arr.length; i++) {
            
            int difference = target - arr[i];

            if (differences.containsKey(difference)) {
                int[] results = { differences.get(difference), i };
                return results;
            }

            differences.put(arr[i], i);

        }

        return new int[] {};

    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3};
        System.out.println(Arrays.toString(twoSum(arr, 7)));
    }

}
