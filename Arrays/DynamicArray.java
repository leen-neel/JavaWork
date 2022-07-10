/**
 * DynamicArray
 */
public class Array {

    private int arr[];
    private int length;

    public Array(int length) {
        this.arr = new int[length];
        this.length = length;
    }

    public void insert(int element) {
        
        if (this.arr.length == this.length) {
            
            int newArr = new int[2 * this.length];

            for (int i = 0; i < this.length; i++) {
                newArr[i] = i;
            }

        }

    }
    
}