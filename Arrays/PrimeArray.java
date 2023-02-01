import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeArray {
    
    public int[][] arr;

    PrimeArray(int m, int n) {
        this.arr = new int[m][n];
    }

    public boolean isPrime(int n) {
        
        int factors = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }

        return factors == 2;

    }

    public void fill() {
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr.length; j++) {
                
                if (isPrime(arr[i][j])) {
                    System.out.print(arr[i][j] + "\t");
                } else {
                    System.out.print(" \t");
                }

            }

            System.out.println();

        }

    }

    public void display() {
        
      this.fill();

    }



    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            
            System.out.print("Enter the length of the array (not more than 20) : ");
            int m = Integer.parseInt(in.readLine());
    
            System.out.print("Enter the width of the array (not more than 20) : ");
            int n = Integer.parseInt(in.readLine());

            System.out.println();
    
            if (m <= 20 && n <= 20) {
                
                PrimeArray ob = new PrimeArray(m, n);
    
                for (int i = 0; i < ob.arr.length; i++) {
    
                    for (int j = 0; j < ob.arr.length; j++) {
                        
                        System.out.print("Enter data for position (" + i + ", " + j + ") : ");
                        ob.arr[i][j] = Integer.parseInt(in.readLine());
                        
                    }
    
                }
    
                System.out.println();
    
                ob.display();
                break;
    
            } else {
                
                System.out.println("Please make the length and the breadth less than or equal to 20");
                System.out.println();
    
            }

        }

    }

}
