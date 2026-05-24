public class Count_Pari_XOR {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println("The count is : " +countpair(arr));
    }

    public static long countpair(int[] arr){
        long oddcount = 0;
        long evencount = 0;

        for(int num : arr){
            if( num % 2 == 0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        return evencount * oddcount;
    }
}