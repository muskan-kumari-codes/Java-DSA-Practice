import java.util.HashMap;

public class highAndLowFrequencyElement {

    // using hashmap....
    public static void high_low_freq_el(int[] a){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : a){
            freq.put(num , freq.getOrDefault(num,0)+1);
        }

        for(int i : freq.keySet()){
            System.out.println(i + " -> " + freq.get(i));
        }

        System.out.println();

        int highFreq = Integer.MIN_VALUE;
        int highfreqEl = -1;
        for(int key : freq.keySet()){
            int currentKey = key;
            int currentValue = freq.get(key);
            if(currentValue>highFreq){
                highFreq = currentValue;
                highfreqEl = currentKey;
            }
        }

        int lowFreq = Integer.MAX_VALUE;
        int lowfreqEl = -1;
        for(int key : freq.keySet()){
            int currentKey = key;
            int currentValue = freq.get(key);
            if(currentValue<lowFreq){
                lowFreq = currentValue;
                lowfreqEl = currentKey;
            }
        }
        System.out.println("high frequency element : " + highfreqEl);
        System.out.println("low frequency element : " + lowfreqEl);
    
    }

}
