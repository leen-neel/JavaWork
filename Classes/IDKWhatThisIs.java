package Classes;

import java.io.BufferedReader;
import java.io.*;

public class IDKWhatThisIs {

    private String customerName;
    private int consumedUnits;
    private double billToPay;

    public void accept() throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the name of the consumer : ");
        this.customerName = in.readLine();

        System.out.print("Enter the units consumed : ");
        this.consumedUnits = Integer.parseInt(in.readLine());

    }

    public void calculateBills() {

        int firstChunk = 0;

        if (this.consumedUnits <= 100) {

            billToPay = consumedUnits * 2;

        } else if (this.consumedUnits <= 300) {

            firstChunk = 100;
            this.consumedUnits -= 100;

            billToPay = firstChunk * 2;
            billToPay += this.consumedUnits * 3;

        } else if (this.consumedUnits > 300) {

            billToPay = this.consumedUnits * 5;

        }

    }

    public static void main(String[] args) throws IOException {

        IDKWhatThisIs help = new IDKWhatThisIs();

        help.accept();
        help.calculateBills();

        System.out.println();

        System.out.println("Name of customer : " + help.customerName);
        System.out.println("Units consumed : " + help.consumedUnits);
        System.out.println("The total price to be paid is : " + help.billToPay + "Rs.");

    }

}
