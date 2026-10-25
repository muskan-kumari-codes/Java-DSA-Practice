package recursion;

public class binarySearchUsingRecursion {

    static int searching(int[] arr, int e, int s, int target){
        if(e>=s){
            int mid = s+(e-s)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid] > target){
                return searching(arr, mid-1, s, target);
            }else{
                return searching(arr, e, mid+1, target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(searching(arr, arr.length-1, 0, 3));
    }
}
