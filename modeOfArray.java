public class modeOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,2,3,1};
        int maxCount = 0;
        int mode = arr[0];
  
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(maxCount<count){
                maxCount = count;
                mode = arr[i];
            }
        }
        System.out.println("mode is " + mode);
    }
}
