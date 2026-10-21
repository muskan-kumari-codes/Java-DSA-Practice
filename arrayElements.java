package recursion;

public class elementsInArray {
    static void print(int[] arr, int i){
        if(i>=arr.length) return;
        print(arr, i+1);
        System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        print(arr,0);
    }
}
