public class ColumnShift {

    public static int[][] shiftCol(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;

        int[][] newArr = new int[m][n];

        for (int j = 0; j < n; j++) {

            int col = j + 1;

            if (col == n) col = 0;

            for (int i = 0; i < m; i++) {
               newArr[i][col] = arr[i][j];
            }
            
        }

        return newArr;
        
    }

    public static void printArr(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j] + "\t");
                
            }

            System.out.println();
            
        }
        
    }

    public static void main(String[] args) {
        
        int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] newArr = shiftCol(arr);

        printArr(arr);

        System.out.println();

        printArr(newArr);

    }
    
}
