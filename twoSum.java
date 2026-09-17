public class twoSum {
    // method to find 2 numbers from array whose sum is equals to the given target..
    static int[] TwoSum(int[] arr, int target){
        int[] ans = new int[2];
        for(int i : arr){
            for(int j : arr){
                if(i != j){
                    if (i + j == target) {
                        ans[0] = i;
                        ans[1] = j;
                        
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -4, -5};
        int[] ans = TwoSum(arr, -8);
        for(int i : ans){
            System.out.println(i);
        }
    }
}
