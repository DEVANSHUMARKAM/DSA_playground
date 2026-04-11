import java.util.HashMap;

public class HighLowOccurance {
    public static void main(String[] args){
        int[] arr = { 7, 8, 4, 5, 4, 1, 1, 7, 7, 2, 5};
        System.out.println("The difference is : " +findDiff(arr));
    }

    public static int findDiff(int[] arr){
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num,0) + 1);
        }

        if(freqMap.size() <= 1){
            return 9;
        }

        int MinFreq = Integer.MAX_VALUE;
        int MaxFreq = Integer.MIN_VALUE;

        for(int count : freqMap.values()){
            if(count > MaxFreq){
                MaxFreq = count;
            }
            if(count < MinFreq){
                MinFreq = count;
            }
        }
        return MaxFreq - MinFreq;
    }
}