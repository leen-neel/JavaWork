/**
 * DynamicArray
 */
public class DynamicArray {

    private int arr[];
    private int length;

    public DynamicArray(int length) {
        this.arr = new int[length];
        this.length = length;
    }

    public void insert(int element) {
        
        if (this.arr.length == this.length) {
            
            int newArr[] = new int[2 * this.length];

            for (int i = 0; i < this.length; i++) {
                newArr[i] = arr[i];
            }

            arr = newArr;

        }

        arr[this.length++] = element;

    }

    public void printArray() {
        
        for (int i = 0; i < this.length; i++) {
            System.err.print(this.arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        
        DynamicArray arr = new DynamicArray(3);

        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        //arr.insert(4);

        arr.printArray();

    }
    
}