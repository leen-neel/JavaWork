import java.util.Scanner;

public class BigSmall {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Taking the two values as input
        System.out.print("Enter first value : ");
        int firstVal = in.nextInt();

        System.out.print("Enter second value : ");
        int secondVal = in.nextInt();

        int totalVal = firstVal + secondVal; // We store the sum of two nums in a variable

        if (totalVal > 100) {

            System.out.println("Big value");
            
        } else {

            System.out.println("Small value");
            
        }

    }
    
}
