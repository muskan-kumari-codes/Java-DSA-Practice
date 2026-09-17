public class pivotIndex {
    static int pivot(int[] a){
        
        int pivot_index = a.length/2;

        for(int i=0; i<a.length; i++){
            int leftSum = 0;
            int rightSum = 0;

            for(int j=0; j<pivot_index; j++){
                leftSum+=a[j];
            }
            for(int j=pivot_index+1; j<a.length; j++){
                rightSum+=a[j];
            }

            if(leftSum == rightSum){
                return pivot_index;
            }else if(leftSum > rightSum){
                pivot_index++;
            }else{
                pivot_index--;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3,2,1,6,5,1,0};
        System.out.println(pivot(a));
    }
}
