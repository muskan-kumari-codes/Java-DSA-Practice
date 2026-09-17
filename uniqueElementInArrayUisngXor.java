public class Practice{
   public static int unique(int[] arr){
        int xorSum = 0;
        for(int num : arr){
            xorSum^=num;
        }
        return xorSum;
    }

}
