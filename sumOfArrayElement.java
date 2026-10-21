package recursion;

public class countElementInArray {
    static int count(int[] arr, int i){
        if(i>=arr.length){
            return 0;
        }
        return arr[i]+count(arr, i+1);
    } 
    public static void main(String[] args) {
        int[] arr = {2,4,6,2,3,1,8,4,5,4,2};
        System.out.println(count(arr, 0));;
    }
}
