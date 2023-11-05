public class LinearSearch {
    public static void main(String[] args) {
        int[] number = {1,46,78,23,68,34,86};
        int ans = Linear(number, 86);
        System.out.println("Element present at index "+ans);
    }
    static int Linear(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }
        for (int index =0; index < arr.length; index++){
            //check for every element at every index if it is =  target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }return -1;
    }
}
