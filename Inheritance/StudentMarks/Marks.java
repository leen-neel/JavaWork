import java.io.*;

public class Marks extends Student {
   
    public void name() throws IOException {
        this.inputData();

        System.out.println();

        this.displayData();
    }

    public static void main(String[] args) throws IOException {
        Marks obj = new Marks();
        obj.name(); 
    }

}
