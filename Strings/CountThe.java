public class CountThe {

    public static int numberOfThe(String str) {

        String[] words = str.split("\\s");
        int count = 0;

        for (int i = 0; i < words.length; i++) {

            if (words[i].equals(" the ")) {

                count += 1;

            }

        }

        return count;

    }

}
