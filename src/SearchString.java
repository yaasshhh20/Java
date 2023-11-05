public class SearchString {
    public static void main(String[] args) {
        String str = "Yash";
        char target = 'Y';
        System.out.println(Search(str,target));
    }
    static boolean Search(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }return false;
    }
}
