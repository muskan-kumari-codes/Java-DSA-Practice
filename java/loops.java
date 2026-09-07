//import java.util.Scanner;

public class loops {
    // sum of 1st 50 numbers ending with d....
    static int whileLoop(int d) {
        int sum = 0;
        int num =1;
        int count = 0;
        while(num>=1){
            if(count>=50) return sum;
                int rem = num%10;
                if(rem==d){
                    sum+=num;
                    count++;
                }
            num+=1;
            
        }
        return sum;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter a number ");
        // int n = sc.nextInt();
        
        // //for loop.....
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();

        // //while loop..
        // int i = 1;
        // while(i<=n){
        //     int j = 1;
        //     while(j<=n){
        //         System.out.print("* ");
        //         j+=1;
        //     }
        //     i+=1;
        //     System.out.println();
        // }
        // System.out.println();

        // // do while loop...
        // int a =1;
        // do{
        //     System.out.println(a);
        //     a++;
        // }while(a<=n);
        int ans = whileLoop(1);
        System.out.println(ans);
    }
}
