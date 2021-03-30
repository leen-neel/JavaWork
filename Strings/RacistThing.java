package Strings;

public class RacistThing {

    public static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {

        String str = "Computer";

        String filteredConst = "";
        String filteredVow = "";

        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                filteredConst += str.charAt(i) + " ";
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                filteredVow += str.charAt(i) + " ";
            }
        }

        System.out.println(filteredConst);
        System.out.println(filteredVow);

    }

}
