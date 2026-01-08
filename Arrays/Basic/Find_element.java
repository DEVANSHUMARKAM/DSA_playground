public class Find_element {
    public static void main(String[] args){
        int key = 3;
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Result: " +find(key, arr));
    }
    public static int find(int key, int[] arr){
        int result = 0;
        for(int i=0; i<arr.length; i++){
            if(i == key){
                result = arr[i];
            }
        }
        return result;
    }
}