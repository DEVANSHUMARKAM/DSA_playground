import java.util.Arrays;
import java.util.ArrayList;



public class SegregateEvenOdd {
    public static void main(String[] args){
        int[] arr1 = {12, 34, 45, 9, 8, 90, 3};
        int[] arr2 = {0, 1, 2, 3, 4};

        segregate(arr1);
        segregate(arr2);
        System.out.println("The arrays after segregate are: ");
        System.out.println("Array 1");
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Array 2");
        for(int j=0; j<arr2.length; j++){
            System.out.print(arr2[j] + " ");
        }
        System.out.println();
    }

    public static void segregate(int[] arr){
        Arrays.sort(arr);

        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();

        for(int num : arr){
            if(num % 2 == 0){
                evens.add(num);
            }else{
                odds.add(num);
            }
        }

        int index = 0;

        for(int e : evens){
            arr[index++] = e;
        }
        for(int o : odds){
            arr[index++] = o;
        }
    }
}