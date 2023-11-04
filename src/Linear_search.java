public class Linear_search {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,0};
        int target = 9;
        int ans = linearSearch(num,target);
        int ans2 = linearSearch2(num, target);
        System.out.println("Element at index: " +ans);
        System.out.println("The element is: "+ans2);
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
    static int linearSearch2(int[] arr, int target){
        for (int element : arr) {
            if (element == target) {
                return target;
            }
        }
        return -1;
    }
}
