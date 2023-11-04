public class Max {
    public static void main(String[] args) {
        int[] arr = {13, 22, 34, 64, 856};
        System.out.print(max(arr));
        System.out.println();
        System.out.print(maxRange(arr,1,3));
    }
    //Finding max
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    //Finding max in range
    static int maxRange(int[] arr, int start, int end){
        int maxVal = start;
        for (int i = start; i <= end; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
