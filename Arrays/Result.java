public class Result {

    String[] nam;
    int[] roll;
    int[] tot;
    int n;

    void Result() {

        nam = null;
        roll = null;
        tot = null;
        n = 0;

    }

    public void getSize(int nm) {
        this.n = nm;
    }

    public void formdata() {

        System.out.println("Name\tRoll\tTotal marks");
        for (int i = 0; i < this.n; i++) {
            
            System.out.println(nam[i] + "\t" + roll[i] + "\t" + tot[i]);

        }

    }

}
