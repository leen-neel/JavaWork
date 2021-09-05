import java.lang.reflect.Field;

public class ReverseNumber {
    
    public static void revNum(int n) {
        
        if (n < 10) {
            
            System.out.println(n);
            return;
            
        } else {

            System.out.print(n % 10);
            revNum(n / 10);
            
        }

    }



}
