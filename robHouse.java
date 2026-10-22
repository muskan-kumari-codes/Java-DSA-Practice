package recursion;

public class robHouse {
    static int solution(int[] arr, int i){
        if(i>=arr.length){
            return 0;
        }
        int include = arr[i] + solution(arr, i+2);
        int exclude = 0 + solution(arr, i+1);
        int ans = Math.max(include, exclude);
        return ans;
    }

    static int rob(int[] arr){
        return solution(arr, 0);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(rob(arr));
    }
}
