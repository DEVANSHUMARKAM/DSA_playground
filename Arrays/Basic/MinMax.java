import java.util.ArrayList;
class MinMax{
    public static void main(String[] args){
       int[] arr = {1,2,3,4,5,6};
       ArrayList<Integer> val = solution(arr);
       System.out.print("The result is: ");
           System.out.print("[");
       for(int i=0; i<val.size(); i++){
           System.out.print(val.get(i));
       }
           System.out.print("]");
       System.out.println();
    }
    public static ArrayList<Integer> solution(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(max);
        result.add(min);
        return result;
    }
}