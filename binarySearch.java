package recursion;

public class binarySearch {
    static int search(int[] arr, int s, int e, int target){
        if(e<s){
            System.out.println("target not found");
            return 0;
        }

        int mid = s+(e-s)/2;
        if(target==arr[mid]){
            System.out.println("target found at index " + mid);
            return 0;
        }else if(arr[mid]>target){
            e = mid-1;
        }else{
            s = mid+1;
        }
        return search(arr, s, e, target);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9};
        search(arr, 0, arr.length-1, 10);
    }
}
