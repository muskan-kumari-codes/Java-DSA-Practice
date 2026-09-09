//code for swap alternate elements in array...
// Asuming array have even number of elements..
public Class Array{
  static int[] alternateSwap(int[] arr){
        for(int i=0; i<arr.length-1; i+=2){
            arr[i] = arr[i]^arr[i+1];
            arr[i+1] = arr[i]^arr[i+1];
            arr[i] = arr[i]^arr[i+1];
        }
        return arr;
    }
}
