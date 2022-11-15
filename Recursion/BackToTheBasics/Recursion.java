/**
 * Recursion
 */
public class Recursion {

    public static int recurs(int n) {

        if (n <= 1) {
            return 1;
        }

        return n + recurs(n - 1);
        
    }

    public static void main(String[] args) {
        
        System.out.println(recurs(10));

    }
    
}
