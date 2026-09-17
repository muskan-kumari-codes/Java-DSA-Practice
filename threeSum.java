public class threeSum {
    static int[] ThreeSum(int[] a, int target){
        int n = a.length;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; i<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(a[i] + a[j] + a[k] == target){
                        int[] ans = {a[i] , a[j] , a[k]};
                        return ans;
                    }
                }
            }
        }
        int[] ans = {};
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] ans = ThreeSum(a, 8);
        for(int i : ans){
            System.out.println(i);
        }
    }
}
