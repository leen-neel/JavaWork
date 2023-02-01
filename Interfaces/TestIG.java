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
        System.out.println(this.name + " says: Oink oink 🐷");
    }

    @Override
    public void sleep() {
        System.out.println(this.name + " is sleeping. Shhhhh! 🤫");
    }
}

class Cat implements Animal {

    public String name;
    
    Cat(String  name) {
        this.name = name;
    }

    @Override
    public void animalSound() {
        System.out.println(this.name + " is meowing 😺");
    }

    @Override
    public void sleep() {
        System.out.println(this.name + " is sleeping. AGAIN!!");
    }

}

/**
 * TestIG
 */
public class TestIG {

    public static void main(String[] args) {
        Pig steven = new Pig("Steven");
        Cat snow = new Cat("Snow");

        steven.animalSound();
        steven.sleep();

        System.out.println();

        snow.animalSound();
        snow.sleep();
    }
    
}
