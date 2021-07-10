public class RevSent {

    public static String reversedSent(String str) {

        String[] words = str.split("\\s");
        String reversedSent = "";

        for (int i = words.length - 1; i >= 0; i--) {

            reversedSent += words[i] + " ";

        }

        return reversedSent;

    }

    public static void main(String[] args) {
        System.out.println(reversedSent("dsjlfjs sd fjsf"));
    }

}
