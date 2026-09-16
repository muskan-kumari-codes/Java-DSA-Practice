class practice{
  static void ExtremeElementsInAlternateManner(int[] a){
        int i = 0;
        int j = a.length-1;
        while(j>=i){
            if(i==j){
                System.out.print(a[i] + " ");
            }else{
                System.out.print(a[i] + " " + a[j] + " ");
            }
            i++;
            j--;
        }
    }
}
