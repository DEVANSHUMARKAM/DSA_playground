public class Second_largest {
    public static void main(String[] args){
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("The result : " +findlargest(arr));
    }
    public static int findlargest(int[] arr){
        int largest = -1;
        int secondlargest = -1;

        for(int num : arr){
            if(num > largest){
                secondlargest = largest;
                largest = num;
            }
            else if(num > secondlargest && num < largest){
                secondlargest = num;
            }
        }
        return  secondlargest;
    }
}