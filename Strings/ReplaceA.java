import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplaceA {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a sentence : ");
        String str = in.readLine();

        String aSanitized = str.replace(" a ", " an ");
        System.out.println();

        System.out.println(aSanitized);

    }

}
