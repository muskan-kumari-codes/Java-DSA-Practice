public class practice {

  public static int secondLargestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                sec = max;
                max = nums[i];
              } else if(sec<nums[i] && nums[i]!=max){
                sec = nums[i];
              } 
        }
        if(sec==Integer.MIN_VALUE){
            return -1;
        }
        return sec;
    } 
    public static void main(String[] args) {
        // int[] a = {5,5,5,5,5};
        // System.out.println(secondLargestElement(a));
        int n=10;
        System.out.println(n<<1);

    } 
    
}


