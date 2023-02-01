public class MixWords {
    
    public static String mixWords(String str1, String str2) {

        StringBuffer mixed = new StringBuffer();

        for (int i = 0; i < str1.length() || i < str2.length(); i++) {

            if (i < str1.length()) {
                mixed.append(str1.charAt(i));
            }

            if (i < str2.length()) {
                mixed.append(str2.charAt(i));
            }
            
        }

        return mixed.toString();
        
    }

    public static void main(String[] args) {
        
        System.out.println(mixWords("JUMP", "STROLL"));

    }

}

