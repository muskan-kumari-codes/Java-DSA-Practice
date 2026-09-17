public class highAndLowFrequencyElement {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,3,4,4,5,4,6,5,1};
        int lowFreq = 1;
        int highFreq = 1;
        int lowFreqEl = a[0];
        int highFreqEl = a[0];

        for(int i=0; i<a.length; i++){
            int count = 0;
            for(int j=0; j<a.length; j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count>highFreq){
                highFreq = count;
                highFreqEl = a[i];
            }
            if(count<=lowFreq){
                lowFreq = count;
                lowFreqEl = a[i];
            }
        }
        System.out.println("high frequency element " + highFreqEl);
        System.out.println("low frequency element " + lowFreqEl);
    }
}
