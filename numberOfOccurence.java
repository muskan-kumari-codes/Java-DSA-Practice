public class binarySearch {
    static int lowerBound(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        if(target > arr[e]) return e+1;
        if(target < arr[s]) return 0;
        while(e>=s){
            int mid = s + (e-s)/2;
            if(arr[mid]>=target){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;
    }

    static int upperBound(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        if(target>arr[e]) return e+1;
        if(target<arr[s]) return s;
        while(e>=s){
            int mid = s + (e-s)/2;
            if(arr[mid] <= target){
                s = mid + 1;
            }else{
                ans = mid;
                e = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // aaray is sorted
        int arr[] = {2,2,3,5,7,7,9};
        
        int upper = upperBound(arr, 7);
        int lower = lowerBound(arr, 7);

        // number of occurence of target in sorted array
        System.out.println("number of occurence : " + (upper-lower));

    }
}
