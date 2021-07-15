import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RenderNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a number : ");
            int n = Integer.parseInt(in.readLine());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
