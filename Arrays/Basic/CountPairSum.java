public class CountPairSum{
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 3, 5, 8};
        int x = 10;

        int result = findcount(x,arr1, arr2);
        System.out.println("The result is : " +result);
    }
        public static int findcount(int x , int[] arr1, int[] arr2){
            int count = 0;
            int left = 0;
            int right = arr2.length - 1;

            while(left < arr1.length && right >= 0){
                int currentsum = arr1[left] + arr2[right];

                if(currentsum == x){
                    count++;
                    left++;
                    right--;
                }else if(currentsum < x){
                    left++;
                }else{
                    right--;
                }
            }
            return count;
        }
    }