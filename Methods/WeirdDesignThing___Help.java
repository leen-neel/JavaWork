public class WeirdDesignThing___Help {

    private static void atSigns(int x, int y) {

        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }

    }

    private static void sqaureChars(int n, char ch) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        atSigns(2, 5);

        System.out.println();

        sqaureChars(5, 'N');
    }

}
