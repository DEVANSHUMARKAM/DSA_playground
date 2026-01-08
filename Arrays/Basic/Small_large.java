public class Small_large {
    public static void main(String[] args){
        int target = 3;
        int[] arr = {1,2,3,4,5,6,7};
        int[] output = find(target, arr);
        for(int res : output){
            System.out.print(" "+res);
        }
        System.out.println();
    }
    public static int[] find(int target, int[] arr){
        int min = 0;
        int max = 0;
        for(int num : arr){
            if(num <= target){
                min++;
            }
            if(num > target){
                max++;
            }
        }
        int[] result = {min,max};
        return result;
    }
}