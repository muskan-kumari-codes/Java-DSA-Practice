package recursion;

public class linearSearch {
    static int searching(int[] arr, int i, int target){
        if(i>=arr.length){
            System.out.println("target not found");
            return 0;
        }
        if(target == arr[i]){
            System.out.println("target found at index " + i);
            return 0;
        }
        return searching(arr, i+1, target);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9};
        searching(arr, 0, 5);
    } 
}
