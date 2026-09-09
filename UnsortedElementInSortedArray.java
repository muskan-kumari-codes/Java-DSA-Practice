//finding the unsorted element in a sorted array...
public class Array{
  static int unsortedElement(int[] arr){
        
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]>=arr[i-1]){
                continue;
            }else{
                return arr[i];
            }
        }
        return 0;
    }
}
