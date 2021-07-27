public class ToggleCases {

    public static String toggleCase(String str) {

        String nstr = "";

        for (int i = 0; i < str.length(); i++) {

            if (Character.isAlphabetic(str.charAt(i))) {

                if (Character.isUpperCase(str.charAt(i))) {

                    nstr += Character.toLowerCase(str.charAt(i));

                } else if (Character.isLowerCase(str.charAt(i))) {

                    nstr += Character.toUpperCase(str.charAt(i));

                }

            } else {

                nstr += str.charAt(i);

            }

        }

        return nstr;

    }

}
