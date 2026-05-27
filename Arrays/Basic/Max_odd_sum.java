public class Max_odd_sum {
    public static void main(String[] args){
        int[] arr = {4, -3, 3, -5};
        System.out.println("The max odd sum : " +findmaxoddsum(arr));
    }

    public static int findmaxoddsum(int[] arr){
        int totalsum = 0;
        int absOdd = Integer.MAX_VALUE;
        boolean hasOdd = false;

        for(int num : arr){
            if(num > 0){
                totalsum += num;
            }
            if(Math.abs(num) % 2 != 0){
                hasOdd = true;
                absOdd = Math.min(absOdd , Math.abs(num));
            }
        }

        if(!hasOdd){
            return -1;
        }

        if(totalsum % 2 != 0){
            return totalsum;
        }else{
            return totalsum - absOdd;
        }
    }
}