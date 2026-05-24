public class Max_So_Far {
    public static void main(String[] args){
        int[] arr = {10, 40, 23, 35, 50, 7};
        System.out.println("The count is : " +countelements(arr));
    }

    public static int countelements(int[] arr){
        if(arr == null || arr.length == 0){
            return 0;
        }

        int count = 1;
        int maxsofar = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > maxsofar){
                count++;
                maxsofar = arr[i];
            }
        }
        return count;
    }
}