import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Result {

    String[] nam;
    int[] roll;
    int[] tot;
    int n;

    void Result() {

        nam = null;
        roll = null;
        tot = null;
        n = 0;

    }

    public void getSize(int nm) {
        this.n = nm;
    }

    public void formdata() {

        System.out.println("Name\tRoll\tTotal marks");
        for (int i = 0; i < this.n; i++) {
            
            System.out.println(nam[i] + "\t" + roll[i] + "\t" + tot[i]);

        }

    }

    public void getdata() throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < this.n; i++) {
            

            System.out.print("Enter name : ");
            this.nam[i] = in.readLine();

            System.out.print("Enter marks : ");
            this.tot[i] = Integer.parseInt(in.readLine());

            this.roll[i] = i + 1;

            System.out.println();

        }

        System.out.println();

    }

    public static void main(String[] args) throws IOException {
        
        System.out.print("Enter the total number of students : ");
        int totalStudents = Integer.parseInt(in.readLine());

        System.out.println();

        Result rs = new Result();

        rs.getSize(totalStudents);
        rs.getdata();
        rs.formdata();


    }

}
