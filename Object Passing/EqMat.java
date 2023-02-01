import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ISC 2018 - Q8
 */
public class EqMat {

    int[][] a;
    private int m, n;

    EqMat(int mm, int nn) {

        m = mm;
        n = nn;
        a = new int[m][n];

    }

    public void readArray() throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                
                System.out.print("Enter value for position (" + i + ", " + j + ") : ");
                a[i][j] = Integer.parseInt(in.readLine());

            }
        }

    }

    public int check(EqMat arr1, EqMat arr2) {

        for (int i = 0; i < arr1.a.length; i++) {            
            for (int j = 0; j < arr1.a[0].length; j++) {
                if (arr1.a[i][j] != arr2.a[i][j]) {
                    return 0;       
                }
            }
        }

        return 1;
        
    }

    public void print() {
       
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of rows : ");
        int m = Integer.parseInt(in.readLine());

        System.out.print("Enter the number of columns : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println();

        EqMat arr1 = new EqMat(m, n);
        EqMat arr2 = new EqMat(m, n);

        System.out.println("Enter the values for first array : ");
        arr1.readArray();

        System.out.println();

        System.out.println("Enter the values for second array : ");
        arr2.readArray();

        System.out.println();

        arr1.print();
        System.out.println();
        arr2.print();

        System.out.println(arr1.check(arr1, arr2) == 1 ? "\nEqual arrays" : "\nNot equal arrays");

    }
    
}
