public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = {12,2,567,7878,45455456,344};
        int ans = FindNums(arr);
        System.out.println(ans);
    }
    static int FindNums(int[] nums){
        int count = 0;
        for (int num : nums){
            if(even(num)){
                count++;
            }
        }return count;
    }

    static boolean even(int nums){
        int numbersOfDigits = digits(nums);
        if (numbersOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    static int digits(int nums) {
        int count = 0;
        while (nums > 0) {

            count++;
            nums = nums / 10;
        }
        return count;
    }
}

