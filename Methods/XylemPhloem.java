import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XylemPhloem {
    
    public static boolean isXylem(int n) {
        
        String num = Integer.toString(n);

        if (num.length() < 3) {
            System.out.println("Number has to have at least 3 digits.");
            System.exit(0);
        }
        
        // Sum of first and last digits
        int firstDig = Character.getNumericValue(num.charAt(0));
        int lastDig = Character.getNumericValue(num.charAt(num.length() - 1));

        int sumExtreme = firstDig + lastDig;
        int sumMean = 0;

        // Sum of nums in the middle
        for (int i = 1; i < num.length() - 1; i++) {
            sumMean += Integer.parseInt(Character.toString(num.charAt(i)));
        }
        
        return sumExtreme == sumMean;

    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        System.out.print(isXylem(n) ? "Xylem number\n" : "Phloem number\n");

    }

}
