import java.util.Scanner;
class Array_Search{
    public static void main(String[] args){
        int arr[] = {4,6,7,9,1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which number want to search");
        int x = sc.nextInt();
        int result = search(arr,x);
        System.out.println("The index of searched element is: " +result);
    }
    public static int search(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}