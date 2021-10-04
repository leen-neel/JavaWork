import java.util.Arrays;
public class CompositeNums {

    public static boolean isComposite(int n) {
        
        int fact = 0;

        for (int i = 1; i <= n; i++) {
            if ( n % i == 0) {
                fact++; 
            }
        }

        return fact > 2;

    }

    public static void arrayComp(int n) {
        
        int[][] arr = new int[n][n];
        int iterator = 4;

        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                
                if (isComposite(iterator)) {
                    arr[i][j] = iterator;
                }

                iterator++;

            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        arrayComp(3);
    }
    
}
