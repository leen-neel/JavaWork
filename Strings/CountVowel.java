public class CountVowel {

    public static boolean isVowel(char ch) {

        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';

    }

    public static int countVowel(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                count++;
            }
        }

        return count;

    }

}
