public class Rearrange {

    public static String arrange(String str) {

        String vow = "", conso = "";
        char ch = ' ';

        for (int i = 0; i < str.length(); i++) {

            ch = str.charAt(i);

            if (Character.isLetter(ch)) {

                switch (ch) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        vow += ch;
                        break;

                    default:
                        conso += ch;
                        break;
                }

            }

        }

        return vow + conso;

    }

    public static void main(String[] args) {
        System.out.println(arrange("ORIGINAL"));
    }

}
