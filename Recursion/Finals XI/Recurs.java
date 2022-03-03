/**
 * Recurs
 */
public class Recurs {
    static int count = 0;
    public static void recurs() {

        count++;

        if (count <= 5) {
            System.out.println("hi");
            recurs();
        }
        
    }

    public static void main(String[] args) {
        recurs();
    }
    
}
