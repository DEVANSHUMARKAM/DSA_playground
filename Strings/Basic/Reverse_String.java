import java.lang.String;

public class Reverse_String {
    public static void main(String[] args){
        String s = "Devanshu";
        System.out.println("The Reveresed output : " +reverse(s));
    }
    public static String reverse(String s){
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
    }
}