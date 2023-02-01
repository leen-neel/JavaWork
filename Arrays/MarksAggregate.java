package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarksAggregate {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int totalStudents = 5;

        int[] physics = new int[totalStudents];
        int[] chem = new int[totalStudents];
        int[] math = new int[totalStudents];

        int above80 = 0;
        int above40 = 0;

        for (int i = 0; i < totalStudents; i++) {

            System.out.print("Enter the marks for Physics for student with roll number " + (i + 1) + " : ");
            physics[i] = Integer.parseInt(in.readLine());

            System.out.print("Enter the marks for Chemistry for student with roll number " + (i + 1) + " : ");
            chem[i] = Integer.parseInt(in.readLine());

            System.out.print("Enter the marks for Math for student with roll number " + (i + 1) + " : ");
            math[i] = Integer.parseInt(in.readLine());

            System.out.println();

        }

        System.out.println();

        for (int i = 0; i < totalStudents; i++) {

            if (physics[i] + chem[i] + math[i] / 3.0 >= 80) {

                above80++;

            } else if (physics[i] + chem[i] + math[i] / 3.0 >= 40) {

                above40++;

            }

        }

        System.out.println("Total students with more than 80% : " + above80);
        System.out.println("Total students with more than 40% : " + above40);

    }

}
