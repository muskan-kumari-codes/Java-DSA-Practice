public class sort0s1s2s {
    static int[] sorting(int[] a){
        int count0 = 0;
        int count1 = 0;
        for(int num : a){
            if(num==0){
                count0++;
            }
            if(num==1){
                count1++;
            }
        }

        for(int i=0; i<a.length; i++){
            if(i<count0){
                a[i] = 0;
            }else if(i>=count0 && i<(count0 + count1)){
                a[i] = 1;
            }else{
                a[i] = 2;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {0,1,0,1,2,1,0};
        int[] arr = sorting(a);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
