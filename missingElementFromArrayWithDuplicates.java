import java.util.ArrayList;

public class missingElementFromArrayWithDuplicates {
    static ArrayList<Integer> missingNum(int[] a){
        ArrayList<Integer> missing = new ArrayList<>();

        int n = a.length;
        for(int i=0; i<n; i++){
            int value = Math.abs(a[i]);
            int pos = value - 1;
            if(a[pos] > 0){
                a[pos] = -a[pos];
            }
        }
        for(int i=0; i<a.length; i++){
            if(a[i]>0){
                missing.add(i+1);
            }
        }
        return missing;
    }

    public static void main(String[] args) {
        int[] a = {1,2,4,2,5,4};
        ArrayList<Integer> ans = new ArrayList<>();
        ans = missingNum(a);
        System.out.println(ans);
    }
}
