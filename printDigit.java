package recursion;

public class printDigit {
    static int digits(int n){
        if(n==0){
            return 0;
        }
        int digit = n%10;
        System.out.println(digit);
        n/=10;
        return digits(n);
    }
    public static void main(String[] args) {
        digits(1482);
    }
}
