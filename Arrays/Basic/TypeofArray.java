public class TypeofArray {
    public static void main(String[] args){
        int arr[] = {2, 1, 5, 4, 3};
        System.out.println("Result" +maxNtype(arr));
    }
    public static int maxNtype(int arr[]){
        int n = arr.length;
        if(n <= 1) return 1;

        int ascendingbreak = 0;
        int descendingbreak = 0;

        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                ascendingbreak++;
            }
            if(arr[i] < arr[i+1]){
                descendingbreak++;
            }
        }
        if(ascendingbreak == 1) return 1;

        if(descendingbreak == 1) return 2;

        if(ascendingbreak == 1 && arr[n-1] < arr[0]) return 4;

        if(descendingbreak == 1 && arr[n-1] > arr[0]) return 3;

        return 0;
    }
}