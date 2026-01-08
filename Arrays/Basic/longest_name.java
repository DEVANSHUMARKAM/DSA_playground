import java.util.List;
import java.util.Arrays;

public class longest_name {
    public static void main(String[] args){
        List<String> arr = Arrays.asList("Apple", "Mango", "Orange", "Banana");
        System.out.println("Output: " +longest(arr));
    }
    public static String longest(List<String> arr){
        String champion = arr.get(0);

        for(String name : arr){
            if(name.length() > champion.length()){
                champion = name;
            }
        }
        return champion;
    }
}