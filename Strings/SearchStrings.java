import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchStrings {

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string : ");
        String str = in.readLine();

        System.out.println();

        System.out.print("Enter the word you want to search : ");
        String search = in.readLine();

        System.out.println();

        String[] words = str.split("\\s");
        int count = 0;
        
        for (int i = 0; i < words.length; i++) {
           if (words[i].equals(search)) {
              count++; 
           } 
        }

        System.out.println("The count is : " + count);

    }    

}
