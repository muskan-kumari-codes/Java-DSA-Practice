public class FactorialExample {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) { // base case
            return 1;
        } else {
            return n * factorial(n - 1); // recursive call
        }
    }
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
