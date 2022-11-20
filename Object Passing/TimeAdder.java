import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeAdder {
   
    public int[] a;

    TimeAdder() {
        this.a = new int[2];
        a[0] = 0;
        a[1] = 0;
    }

    public void addTime(TimeAdder time_1, TimeAdder time_2) {

        int hrSum = time_1.a[0] + time_2.a[0];
        int minSum = time_1.a[1] + time_2.a[1];

        this.a[0] = hrSum + (minSum / 60);
        this.a[1] = minSum % 60;

    }

    public void readTime() throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the hours : ");
        this.a[0] = Integer.parseInt(in.readLine());

        System.out.print("Enter the minutes : ");
        this.a[1] = Integer.parseInt(in.readLine());
        
    }

    public void dispTime() {

        System.out.println(this.a[0] + " hours and " + this.a[1] + " minutes");
        
    }

    public static void main(String[] args) throws IOException {

        TimeAdder time_1 = new TimeAdder();
        TimeAdder time_2 = new TimeAdder();
        
        TimeAdder adder = new TimeAdder();

        System.out.println("Enter values for time A : ");
        time_1.readTime();

        System.out.println();

        System.out.println("Enter values for time B : ");
        time_2.readTime();

        System.out.println();

        time_1.dispTime();
        time_2.dispTime();

        System.out.println();

        System.out.print("Their sum is : ");
        adder.addTime(time_1, time_2);
        adder.dispTime();
        
    }

}
