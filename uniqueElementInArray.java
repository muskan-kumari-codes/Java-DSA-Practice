import java.util.HashSet;

public class uniqueElementInArray {
    public static HashSet<Integer> uniqueElement(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(!set.add(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
            
        }
        return set;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,4,5,3,4};
        System.out.println(uniqueElement(arr));
    }
}
