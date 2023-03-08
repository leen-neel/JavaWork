import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatRev {

    int[][] arr;
    int m, n;

    public MatRev(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }

    public void fillArray() throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print("Enter data for position (" + i + ", " + j + ") : ");
                arr[i][j] = Integer.parseInt(in.readLine());

            }

        }

    }

    public static int reverse(int x) {

        StringBuffer num = new StringBuffer(Integer.toString(x));
        return Integer.parseInt(num.reverse().toString());

    }

    public void revmat(MatRev p) {

        for (int i = 0; i < p.m; i++) {

            for (int j = 0; j < p.n; j++) {

                this.arr[i][j] = reverse(p.arr[i][j]);

            }

        }

    }

    public void display() {

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(arr[i][j] + "\t");

            }

            System.out.println();

        }

    }

    public static void main(String[] args) throws IOException {

        MatRev p = new MatRev(2, 2);
        MatRev q = new MatRev(2, 2);

        p.fillArray();

        System.out.println();

        q.revmat(p);

        p.display();
        System.out.println();
        q.display();

    }

}
