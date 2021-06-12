import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FreqVowel {

    public static HashMap<String, Integer> vowelCount(String str) {

        HashMap<String, Integer> vowelFreq = new HashMap<String, Integer>();

        str = str.toUpperCase();

        int count = 0;
        char ch = ' ';

        vowelFreq.put("A", 0);
        vowelFreq.put("E", 0);
        vowelFreq.put("I", 0);
        vowelFreq.put("O", 0);
        vowelFreq.put("U", 0);

        for (int i = 0; i < str.length(); i++) {

            ch = str.charAt(i);

            if (ch == 'A') {

                count = vowelFreq.get("A");
                vowelFreq.put("A", count + 1);

            } else if (ch == 'E') {

                count = vowelFreq.get("E");
                vowelFreq.put("E", count + 1);

            } else if (ch == 'I') {

                count = vowelFreq.get("I");
                vowelFreq.put("I", count + 1);

            } else if (ch == 'O') {

                count = vowelFreq.get("O");
                vowelFreq.put("O", count + 1);

            } else if (ch == 'U') {

                count = vowelFreq.get("U");
                vowelFreq.put("U", count + 1);

            }

        }

        return vowelFreq;

    }

}
