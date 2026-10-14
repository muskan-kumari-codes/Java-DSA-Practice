package recursion;

public class maxElementArray {
    static int maxElement(int[] arr, int i, int max){
        
        if(i>=arr.length){
            System.out.println(max);
            return 0;
        }
        if(arr[i]>max){
            max = arr[i];
        }
        
        return maxElement(arr, i+1, max);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,7,5,9,6};
        int max = arr[0];
        maxElement(arr, 0, max); 
    }
}
