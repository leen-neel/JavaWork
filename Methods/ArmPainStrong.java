import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmPainStrong {

    public static boolean isArmStrong(int n) {

        String numStr = Integer.toString(n);
        int sum = 0;

        for (int i = 0; i < numStr.length(); i++) {
            sum += Math.pow(Character.getNumericValue(numStr.charAt(i)), 3);
        }

        return sum == n;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println(
                isArmStrong(n) ? "The number is an Armstrong number" : "The number isn't an Armstrong number.");

    }

}
