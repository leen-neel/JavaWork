import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recurs {

    static int count = 0;

    public static void recursion(String str) {
        
        count++;
        
        if (count <= 5) {
            System.out.println(str);
            recursion(str);
        }

    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string : ");
        String str = in.readLine();

        System.out.println();

        recursion(str);

    }

}
