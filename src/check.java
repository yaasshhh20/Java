//import java.util.Scanner;
//public class check {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a 3 digit number: ");
//        int n = in.nextInt();
//
//        System.out.println(isArmstrong(n));
//    }
//    static boolean isArmstrong(int n){
//        int original = n;
//        int sum = 0;
//
//        while (n>0){
//            int rem = n % 10;
//            n = n /10;
//            sum = sum + rem*rem*rem;
//        }
//        if(sum == original){
//            return true;
//        }
//        return false;
//    }
//}
import java.util.Scanner;
public class check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if(isValidPassword(password)){
            System.out.println("Password is strong");
        }else{
            System.out.println("Invalid password");
        }
    }
    private static boolean isValidPassword(String password){
        if(password.length()<8){
            System.out.print("Invalid password: Length must be 8 character");
            return false;
        }
        if(password.matches("[0-9]+")|| password.matches("[a-zA-Z]+")|| password.matches("[^a-zA-Z0-9]+")){
            System.out.print("Weak password: Contains only numbers, alphabet, or special characters");
            return false;
        }
        if(password.matches(".*[0-9].*")&& password.matches(".*[a-zA-Z].*")&& password.matches(".*[a-zA-Z0-9].*")){
            System.out.println("strong password: Contains alphabets,numeric and special character");
            return true;
        }else{
            System.out.print("Moderate password: Contains a combination of numbers and alphabets or alphabets and special characters or special character nad numbers");
            return false;
        }
    }
}