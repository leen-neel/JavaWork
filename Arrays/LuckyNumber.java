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

/**
 * Algorithm:
 * 
 * We have an iterator variable which keeps track of the index of the element of the list
 * The iterator variable resets every time an element is removed
 * 
 * The i variable keeps track of which element is to be removed
 * 
 * Step 1: incerement the iterator variable by 1
 * Step 2: Check if i == iterator is matching, if they are remove the corresponding element and reset the value of iterator
 * Step 3:Increment the value of i
 * Step 4: Reset iterator
 * Step 5: If the value of i is greater than the value of the list iteself, break the loop
 * Step 6: Print the list
 */
