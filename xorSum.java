public class xorSum {

    //finding missing number in array in the range of 0 to n...
    public static int xor_sum(int[] a, int n){
        // n is the range
        int xorSum = 0;
        for(int i : a){
            xorSum^=i;
        }
        for(int i=0; i<=n; i++){
            xorSum^=i;
        }
        return xorSum;
    }

    public static void main(String[] args) {
       int[] a = {0,1,4,3,2};
       System.out.println(xor_sum(a, 5)); 
        
    }
}
