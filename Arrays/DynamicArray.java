import java.util.Arrays;

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

            int[] newArr = new int[this.length + 1];

            // Adding the elements of the old array to the new array
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }

            newArr[newArr.length - 1] = element; // Add the given element to the end of the new array
            this.length = newArr.length; // Update the length
            
            // Replace the array with the new array
            this.arr = new int[this.length];
            this.arr = newArr;
            
        }

        // arr[this.length++] = element;
        
    }

    // public void insert(int element) {
        
    //     if (this.arr.length == this.length) {
            
    //         int newArr[] = new int[2 * this.length];

    //         for (int i = 0; i < this.length; i++) {
    //             newArr[i] = arr[i];
    //         }

    //         arr = newArr;

    //     }

    //     arr[this.length++] = element;

    // }

    public String toString() {
        
        String str = "";

        for (int i = 0; i < this.length; i++) {
            str += this.arr[i] + " ";
        }

        return str.trim();

    }

    public static void main(String[] args) {
        
        DynamicArray arr = new DynamicArray(0);

        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);

        System.out.println(arr);

    }
    
}