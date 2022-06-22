/**
 * TestIG
 */
interface Animal {

    public void animalSound();
    public void sleep();
    
}

class Pig implements Animal {

    public String name;

    Pig(String name) {
        this.name = name;
    }

    @Override
    public void animalSound() {
        System.out.println(this.name + " says: Oink oink");
    }

    @Override
    public void sleep() {
        System.out.println(this.name + " is sleeping. Shhhhh! 🤫");
    }
}

/**
 * TestIG
 */
public class TestIG {

    public static void main(String[] args) {
        Pig steven = new Pig("Steven");

        steven.animalSound();
        steven.sleep();
    }
    
}
