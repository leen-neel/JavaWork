import java.util.Scanner;

public class TestMarks {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // Taking the marks as input
        System.out.print("Enter the marks for the OOP Test : ");
        int marks = in.nextInt();

        // Checking if the marks is beteween 30 and 50
        if (marks >= 30 && marks <= 50) {
            
            System.out.println("Average student.");

        } else if (marks < 30) { // If the above condition isn't met, the program will check if the marks is less than 30
            
            System.out.println("Study harder");

        } else {

            System.out.println("Excelent!!"); // If none of the conditions is met, this will run

        }

    }
    
}
