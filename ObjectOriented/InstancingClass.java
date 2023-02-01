public class InstancingClass {

    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sum() {
        return this.a + this.b;
    }

    public static void main(String[] args) {

        InstancingClass ob = new InstancingClass();

        ob.setA(4);
        ob.setB(6);
        System.out.println(ob.sum());

    }

}
