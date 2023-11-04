import java.util.Arrays;

public class searchIn2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                {1,22,32,34},
                {52,62,7,48},
                {9,0,78,45,33}
        };
        int target = 78;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[0];
    }
}
