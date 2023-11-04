public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,23,45,567,8888};
        System.out.println(FindNums(nums));
    }
    static int FindNums(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }
    static int digits(int num){
        int count = 0;

        while (num >0 ){
            count++;
            num = num /10;
        }
        return count;
    }
}
