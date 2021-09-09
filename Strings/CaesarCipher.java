import java.util.HashMap;
import java.util.Map;

public class CaesarCipher {

    public static String encrypt(String str) {
        
        Map<String, String> cipher = new HashMap();

        cipher.put("A", "N");
        cipher.put("B", "O");
        cipher.put("C", "P");
        cipher.put("D", "Q");
        cipher.put("E", "R");
        cipher.put("F", "S");
        cipher.put("G", "T");
        cipher.put("H", "U");
        cipher.put("I", "V");
        cipher.put("J", "W");
        cipher.put("K", "X");
        cipher.put("L", "Y");
        cipher.put("M", "Z");

        cipher.put("N", "A");
        cipher.put("O", "B");
        cipher.put("P", "C");
        cipher.put("Q", "D");
        cipher.put("R", "E");
        cipher.put("S", "F");
        cipher.put("T", "G");
        cipher.put("U", "H");
        cipher.put("V", "I");
        cipher.put("W", "J");
        cipher.put("X", "K");
        cipher.put("Y", "L");
        cipher.put("Z", "M");

        

        return cipher.get(str);

    }

    public static void main(String[] args) {
        System.out.println(encrypt("Z"));
    }

}
