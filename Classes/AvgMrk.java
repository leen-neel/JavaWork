package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AvgMrk {

    public int eng;
    public int hnd;
    public int mts;

    public int avg;

    public void accept() throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a marks for English : ");
        this.eng = Integer.parseInt(in.readLine());

        System.out.print("Enter marks for Hindi : ");
        this.hnd = Integer.parseInt(in.readLine());

        System.out.print("Enter marks for Maths : ");
        this.mts = Integer.parseInt(in.readLine());

        System.out.println();

    }

    public void average() {
        this.avg = (this.eng + this.hnd + this.mts) / 3;
    }

    public static void main(String[] args) throws IOException {

        AvgMrk ob = new AvgMrk();

        ob.accept();
        ob.average();

        System.out.println("The average mark is : " + ob.avg);

    }

}
