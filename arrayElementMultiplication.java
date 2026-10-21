package recursion;

public class arrayElementMultiplication {
    static int multi(int[] arr, int i){
        if(i>=arr.length) return 1;
        return arr[i]*multi(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(multi(arr,0));
    }
}
