import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 12;
        arr[2] = 13;
        arr[3] = 14;
        arr[4] = 15;
        //[1,12,13,14,15]

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        // for (int i = 0; i < arr.length; i++) {
        //    System.out.print(arr[i]+ " ");
        //}
//        for(int j: arr){                 //for every element in array print the array
  //          System.out.print(j+ " ");
    //    }
        System.out.println(Arrays.toString(arr));
    }
}
