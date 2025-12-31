class Rotate{
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        solution(arr);
        System.out.println("The result is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void solution(int[] arr){
        int n = arr.length;
        int lastelement = arr[n-1];

        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastelement;
    }
}