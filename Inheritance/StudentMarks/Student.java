import java.io.*;
public class Student {
    
    String name, dob;
    int roll;

    public void inputData() throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter name : ");
        this.name = in.readLine();

        System.out.print("Enter date of birth : ");
        this.dob = in.readLine();

    }

    public void displayData() {
        System.out.println("Name : " + this.name);
        System.err.println("Date of birth : " + this.dob);
    }

}
