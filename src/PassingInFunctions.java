import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class PassingInFunctions {
    public static void main(String[] args) {
        int[] num = {3,2,1,4};
        System.out.print(Arrays.toString(num));
        change(num);
        System.out.print(Arrays.toString(num));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
