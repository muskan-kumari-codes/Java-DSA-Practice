//printing alternate extreme elements of an array..
public class Practice{
   static List<Integer> alternateExtreme(int[] a){
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = a.length-1;
        while(right>left){
            list.add(a[left]);
            list.add(a[right]);
            right--;
            left++;
        }
        return list;
    }
}
