class practice{
  public int[] reverseArray(int[]arr){
      int left = 0; 
      int right = arr.length-1;
      while(right>left){
         arr[left] = arr[left]^arr[right];
         arr[right] = arr[left]^arr[right];
         arr[left] = arr[left]^arr[right];
         left++;
         right--;
      }
    return arr;
  }
}
