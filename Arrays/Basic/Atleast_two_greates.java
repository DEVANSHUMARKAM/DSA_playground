//Given an array arr of distinct elements, the task is
//to return an array of all elements except
//the two greatest elements in sorted order.

import java.util.Arrays;

public class Atleast_two_greates{
    public static void main(String[] args){
        long[] arr = {2,3,4,1,8};
        long finalresult[] = findelements(arr);
        for(int i=0; i<finalresult.length; i++){
            System.out.print(finalresult[i]);
        }
        System.out.println();
    }
    public static long[] findelements(long arr[]){
        Arrays.sort(arr);
        int newsize = arr.length -2;
        long result[] = new long[newsize];

        for(int i=0; i<newsize; i++){
            result[i] = arr[i];
        }
    return result;
    }
}