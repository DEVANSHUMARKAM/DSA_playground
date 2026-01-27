public class Find_first_one{
    public static void main(String[] args){
        int arr[] = {0,0,0,0,1,1,1,1};
        int result = find(arr);
        System.out.println("Output: " +result);
    }
    public static int find(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                return i;
            }
        }
        return -1;
    }
}