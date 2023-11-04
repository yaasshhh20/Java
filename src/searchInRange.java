public class searchInRange {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,0};
        int target = 55;
        System.out.println(linearSearch(num,target,0,7));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
