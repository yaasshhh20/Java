import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
////        System.out.println(rev(arr));
//        rev(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void swap(int[] arr, int index1, int index2) {
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//    }
//    static int rev(int[] arr){
//        int start = 0;
//        int end = arr.length-1;
//
//        while (start<end) {
//            //swap
//            swap(arr, start, end);
//            start++;
//            end--;
//        }
//        return start;

//        int[] arr = {1,2,3,4,5};
////        System.out.println(max(arr));
//        System.out.println(maxRange(arr,1,2));
            int[] arr = {1,2,3,4,5,6,7,8,9};
//            swap(arr, 0, 9);
            reverse(arr);
            System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static int swap(int[] arr, int index1, int end){
        int temp = arr[index1];
        arr[index1] = arr[end];
        arr[end] = temp;
        return temp;
    }











//    static int maxRange(int[] arr, int start, int end){
//        int maxVal = arr[start];
//        for (int i = start; i <= end; i++) {
//            if(arr[i] > maxVal){
//                maxVal = arr[i];
//            }
//        }
//        return maxVal;
//    }
//    static int max(int[] arr){
//        int maxVal = arr[0];
//        for (int i = 1; i <arr.length; i++) {
//            if(arr[i] > maxVal){
//                maxVal = arr[i];
//            }
//        }
//        return maxVal;
//    }
    }

