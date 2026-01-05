class Sum_of_Array{
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        System.out.println(solution(arr));
    }
    public static int solution(int[] arr){
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}