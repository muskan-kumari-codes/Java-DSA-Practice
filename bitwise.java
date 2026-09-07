public class bitwise {
    public static void main(String[] args) {
        int n = 10;

        //divide by 2......
       // System.out.println(n>>1);          //right sift......
        
        /// multiply with 2......
      //  System.out.println(n<<1);           // left sift......

        // even odd....
        // if((n&1)==0){
        //     System.out.println(n + " is even");
        // }else{
        //     System.out.println(n + " is odd");
        // }

        // power of 2..
        // if((n&(n-1))==0){
        //     System.out.println(n + " is power of num");
        // }else{
        //     System.out.println(n + " is not a power of 2");
        // }

        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(5 ^ 6);
        // System.out.println(~5);
        // System.out.println(3<<2);
        // System.out.println(16>>2);

        // swap 2 numbers....
        // int a = 5;
        // int b = 6;
        // System.out.println("before........");
        // System.out.println("a : " + a);
        // System.out.println("b : " + b);
    
        // a = a^b;
        // b = a^b;
        // a = a^b;
        // System.out.println("after...........");
        // System.out.println("a : " + a);
        // System.out.println("b : " + b);

        // unique num (all other appear twice)
        int[] num = {2, 6, 7, 2, 7, 8, 8};
        for(int i=0; i<num.length-1; i++){
            num[i]^num[i+1];
        }
        System.out.println(num);
    }
}
