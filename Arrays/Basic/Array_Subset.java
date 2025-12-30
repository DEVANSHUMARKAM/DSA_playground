import java.util.HashMap;

class Array_Subset{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = {3,4,0};
        boolean result = solution(a,b);
        if(result){
            System.out.println("Yes b is a subset of a");
        }else{
            System.out.println("No b is not a subset of a");
        }
    }
    public static boolean solution(int a[], int b[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : a){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : b){
            if(map.containsKey(num) && map.get(num) > 0){
                map.put(num, map.get(num) - 1);
            }else{
                return false;
            }
        }
        return true;
    }
}