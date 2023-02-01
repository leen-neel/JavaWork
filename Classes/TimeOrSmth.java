import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeOrSmth {

    int hour;
    int min;
    int sec;

    public void getTime() throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter hour : ");
        this.hour = Integer.parseInt(in.readLine());

        System.out.print("Enter minute : ");
        this.min = Integer.parseInt(in.readLine());

        System.out.print("Enter second : ");
        this.sec = Integer.parseInt(in.readLine());

    }

    public void showTime() {
        System.out.println(this.hour + " : " + this.min + " : " + this.sec);
    }

    public static void main(String[] args) throws IOException {

        TimeOrSmth ob = new TimeOrSmth();

        ob.getTime();

        System.out.println();

        ob.showTime();

    }

}
