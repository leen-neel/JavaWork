import java.io.IOException;

public class Recurs {

    static int count = 0;

    public static void recursion(String str) {
        
        count++;
        
        if (count <= 5) {
            System.out.println(str);
        }

        recursion(str);

    }

    public static void main(String[] args) throws IOException {
        
        

    }

}
