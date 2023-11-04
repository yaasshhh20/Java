import java.util.Arrays;
import java.util.Scanner;
public class MultiDimArr {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        //INPUT
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //OUTPUT
        //for (int[] value : arr) {
            //for (int col = 0; col < value.length; col++) {
            //    System.out.print(value[col] + " ");
           // }
         //   System.out.println();
       // }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}