import java.util.concurrent.ThreadLocalRandom;

public class Rando {

    public static void main(String[] args) {

        System.out.println(ThreadLocalRandom.current().nextInt(1, 6));

    }

}
