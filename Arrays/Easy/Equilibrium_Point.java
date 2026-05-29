public class Equilibrium_Point {
    public static void main(String[] args){
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println("The equilibrium point is : " +findequilibrium(arr));
    }

    public static int findequilibrium(int[] arr){
        int n = arr.length;
        long totalsum = 0;
        int leftsum = 0;

        for(int x : arr){
            totalsum += x;
        }

        for(int i=0; i<n; i++){
            long rightsum = totalsum - leftsum - arr[i];

            if(rightsum == leftsum){
                return i;
            }
            leftsum += arr[i];
        }
        return  -1;
    }
}