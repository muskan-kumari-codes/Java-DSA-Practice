public class array {
    static int[] reverse(int[] arr, int start, int end){
        while(end>start){
            arr[start] = arr[start]^arr[end];
            arr[end] = arr[start]^arr[end];
            arr[start] = arr[start]^arr[end];
        }
        return arr;
    }
    static int[] right_shift_by_1(int[] a){
        int n = a.length-1;
        reverse(a, 0, n);
        reverse(a, 1, n);
        
        return a;
    }
}
