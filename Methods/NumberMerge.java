import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberMerge {

    long n1;
    long n2;
    long mergeNum;

    NumberMerge() {
        n1 = 0;
        n2 = 0;
        mergeNum = 0;
    }

    public void readNum() throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        this.n1 = Long.parseLong(in.readLine());

        System.out.print("Enter another number : ");
        this.n2 = Long.parseLong(in.readLine());

    }

    public void joinNum() {

        mergeNum = Long.parseLong(Long.toString(n1) + Long.toString(n2));

    }

    public void show() {
        System.out.println("\nThe merged number is : " + mergeNum);
    }

    public static void main(String[] args) throws IOException {
        NumberMerge ob = new NumberMerge();

        ob.readNum();
        ob.joinNum();
        ob.show();
    }
    
}
