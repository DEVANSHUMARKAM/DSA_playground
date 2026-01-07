import java.util.Arrays;
import java.util.List;

public class Majority{
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(1,1,1,1,2,2,2,3,3,3,3,3,3,3,4,4);
        int x = 3;
        int y = 1;
        int result = find(arr,x,y);
        System.out.println("Majority number is: " +result);
    }
    public static int find(List<Integer> arr, int x, int y){
        int countx = 0;
        int county = 0;
        for(int num : arr){
            if(num == x){
                countx++;
            }else if(num == y){
                county++;
            }
        }if(countx > county){
            return x;
        }else if(county > countx){
            return y;
        }else {
            return ( x < y) ? x : y;
        }
    }
}