import java.util.HashSet;

public class union {
    public static void main(String[] args) {
        int[] a1 = {1,4,2,5,5,4,2};
        int[] a2 = {1,4,2,8,6};

        HashSet<Integer> union = new HashSet<>();
        for(int i = 0; i<a1.length; i++){
            union.add(a1[i]);
            
        }
        for(int i=0; i<a2.length; i++){
            union.add(a2[i]);
        }

        System.out.println(union);
    }
}
