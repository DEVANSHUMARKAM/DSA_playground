class PalindromeElement{
    public static void main(String[] args){
        int[] arr = {111,222, 333, 444};
        for(int num : arr){
            if(!isPalindrome(num)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int n){
        int original = n;
        int reversed = 0;

        while(n>0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n /10;
        }
        return original == reversed;
    }
}