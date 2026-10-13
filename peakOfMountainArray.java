package searching;

public class peakIndexMountainArray {
    static int peakIndex(int[] arr){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(e>=s){
            int mid = s+(e-s)/2;
            if(arr[mid]<arr[mid+1]){
                //ascending order vala part
                s = mid+1;
            }else{
                //arr[mid]>arr[mid+1]
                //descending order vala part
                ans = mid;
                e = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {0,2,4,5,3,1};
        System.out.println(peakIndex(arr));
    }
}
