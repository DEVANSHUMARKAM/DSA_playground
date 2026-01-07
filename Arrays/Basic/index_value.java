import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class index_value{
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(Arrays.asList(15, 2, 45, 4, 7));
        int val = 22;
        int index = 3;
        insert(arr,val,index);
        System.out.println("Result" +arr);
    }
    public static void insert(List<Integer> arr , int val , int index){
        arr.add(index, val);
    }
}