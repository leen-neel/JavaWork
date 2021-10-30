import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LuckyNumber {

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the length of the list : ");
        int n = Integer.parseInt(in.readLine());

        ArrayList<Integer> arr = new ArrayList<Integer>();

        // Adding the numbers to the list
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }

        int iterator = 0;
        int i = 2;

        while (true) {
            
            for (int j = 0; j < arr.size(); j++) {

                iterator++;

                if (i == iterator) {
                    arr.remove(j);
                    iterator = 1;
                }
            }

            i++;
            iterator = 0;

            if (arr.size() < i) {
                break;
            }

            continue;

        }
        

        System.out.println(arr);

    }

}


