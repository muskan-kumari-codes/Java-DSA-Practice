public class maths_logic {

    static void print_digits_of_num(int num){
    // printing the digits of a number....
        while(num>0){
            int rem = num%10;
            System.out.println(rem);
            num/=10;
        }
}
     
    static int count_digits_of_num(int num){
        int count = 0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }

    static int sum_digit_num(int num){
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }

    static int reverse_num(int num){
        int reverse = 0;
        while(num>0){
            int digit = num%10;
            num/=10;
            reverse = reverse*10 + digit;
        }
        return reverse;
    }

    static boolean is_palindrome(int num){
        int reverse = 0;
        int orignal = num;
        while(num>0){
            int digit = num%10;
            num/=10;
            reverse = reverse*10 + digit;
        }
        if(orignal == reverse) return true;
        return false;
    }

    static boolean is_prime(int num){
        for(int i=2; i*i<=num; i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }

    static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b){
        int multi = a*b;
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;
        System.out.println(gcd);
        int ans = multi/gcd;
        return ans;
    }

    static boolean is_armstrong(int num){
        int original = num;
        int new_num = 0;
        while(num>0){
            int digit = num%10;
            num/=10;
            new_num+=(digit*digit*digit);
        }
        if(original == new_num){
            return true;
        }
        return false;
    }


    static boolean is_perfect_num(int num){
        int original = num;
        int sum = 0;
        for(int i=1; i<num; i++){
            if(num % i == 0){
                sum+=i;
            }
        }
        if(original == sum)
            return true;
        return false;
    }
    
    // sieve of eratosthenes..
    static void print_prime_number(int n){
        for(int i=2; i<n; i++){
        boolean isPrime = is_prime(i);
        if(isPrime == true){
            System.out.println(i);
        }
        }
    }


    public static void main(String[] args) {

        //print_digits_of_num(534267);

        //int num = 547823;
        
        //System.out.println("number of digits in " + num + " is " + count_digits_of_num(num));
        
        //System.out.println("sum of digits in " + num + " is " + sum_digit_num(num));

        //System.out.println("reverse of " + num + " is " + reverse_num(num));

        //System.out.println(is_palindrome(12321));

        //System.out.println(is_prime(36));

        //System.out.println(gcd(18,12));

       // System.out.println(lcm(18,12));

       //System.out.println(is_armstrong(159));

       //System.out.println(is_perfect_num(6));

       print_prime_number(6);
    }
}
