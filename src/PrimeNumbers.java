public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 10;
        System.out.println("Prime numbers between 1 and " + limit + " are:");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
