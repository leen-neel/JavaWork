/**
 * TestIG
 */
interface Animal {

    

    public void animalSound();
    public void sleep();
    
}

class Pig implements Animal {
    @Override
    public void animalSound() {
        System.out.println("Oink oink");
    }

    @Override
    public void sleep() {
        System.out.println("*sleeps in oink oink*");
    }
}

/**
 * TestIG
 */
public class TestIG {

    public static void main(String[] args) {
        Pig steven = new Pig();

        steven.animalSound();
        steven.sleep();
    }
    
}
