import java.util.Scanner;

public class AddThreeNums {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double a = in.nextDouble();

        System.out.print("Enter second number : ");
        double b = in.nextDouble();

        System.out.print("Enter third number : ");
        double c = in.nextDouble();

        System.out.println();
        double sum = a + b + c;

        System.out.println("The sum of the three numbers is : " + sum);

    }
    
}
