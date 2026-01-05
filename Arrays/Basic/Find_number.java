class Find_number {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int result = solution(arr, k);
        System.out.println(result);
    }

    public static int solution(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
}