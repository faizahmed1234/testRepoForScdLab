//Peforming Lab 14

public class IntegerOperations {
    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Factorial cannot be calculated for negative numbers");
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
    }
}
