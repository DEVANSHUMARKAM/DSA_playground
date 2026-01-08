public class Replace_zero_five{
    public static void main(String[] args){
        int num = 10003;
        int output = replace(num);
        System.out.println("Result: " +output);
    }
    public static int replace(int num){
        if(num == 0){
            return 5;
        }
        int result = num;
        int placevalue = 1;
        int temp = num;

        while(temp > 0){
            int digit = temp % 10;

            if(digit == 0){
                result = result + (5 * placevalue);
            }
            placevalue = placevalue * 10;

            temp = temp /10;
        }
        return result;
    }
}