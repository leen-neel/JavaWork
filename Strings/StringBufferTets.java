public class StringBufferTets {

    public static void main(String[] args) {
        
        String str = "ba";
        StringBuffer strb = new StringBuffer(str);

        StringBuffer reverse = strb.reverse();

        String rev = reverse.toString();

        System.out.println(str.equals(rev));

    }
    
}
