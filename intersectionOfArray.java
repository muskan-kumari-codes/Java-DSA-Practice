// intersection of two arrays...
public class practice{
  static ArrayList<Integer> intersection(int[] a, int[] b){
        ArrayList<Integer> inter = new ArrayList<>();

        for(int i=0; i<a.length ;i++){
            for(int j=0; j<b.length; j++){
                if(a[i] == b[j]){
                    inter.add(a[i]);
                }
            }
        }

        return inter;
    }
}
