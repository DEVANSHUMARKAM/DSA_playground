class Largest_Number{
    public static void main(String[] args){
        int[] arr = {1,4,5,6,4};
        int result = findlargest(arr);
        System.out.println("Largest number is: " +result);
    }
    public static int findlargest(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}