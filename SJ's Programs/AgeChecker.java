import java.util.Scanner;

public class AgeChecker {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = in.nextInt(); // First, we take the age as input from the user

        // This if statement checks if the age is less than 18
        if (age < 18) {
            
            // Anything here will get executed only if the age is less than 18
            System.out.println("Young student.");

        }

    }

}
