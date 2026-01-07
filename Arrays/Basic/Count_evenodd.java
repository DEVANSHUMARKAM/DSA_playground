public class Count_evenodd{
    public static void main(String[] args){
        int[] arr = { 1,2,3,4,5};
        int[] result1 = count(arr);
        for(int i=0; i<result1.length; i++){
        System.out.print(+result1[i]);
        }
        System.out.println();
    }
    public static int[] count(int[] arr){
        int odd = 0;
        int even = 0;
        for(int num : arr){
            if(num % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        int[] result = {odd, even};
        return result;
    }
}