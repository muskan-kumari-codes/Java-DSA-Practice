public class RemovingDuplicateFromSortedArray {
    // returning the length of array after removing duplicates
    static int removingDuplicate(int[] a){
        int i = 0;
        int j = 1;
        int n = a.length;
        while(j<n){
            if(a[i] == a[j]){
                j++;
            }else{
                i++;
                a[i] = a[j];
                j++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,2,3,3,4};
        System.out.println(removingDuplicate(a));
    }
}
