import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CicularArea {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the radius : ");
        int radius = Integer.parseInt(in.readLine());

        double area = Math.PI * (radius * radius);

        System.out.println("The area is : " + area);

    }

}
