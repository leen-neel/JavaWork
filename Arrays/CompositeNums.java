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

        

    }

    public static void main(String[] args) {
        System.out.println(isComposite(4));
    }
    
}
