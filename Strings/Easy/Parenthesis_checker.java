import java.lang.String;
import java.util.ArrayDeque;
import java.util.Deque;

public class Parenthesis_checker {
    public static void main(String[] args){
        String s ="([{]})";
        boolean result = isBalanced(s);
        System.out.println("The result: " +result);
    }
    public static boolean isBalanced(String s){
        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.peek();

                if( (ch == ')' && top == '(') ||
                        (ch == '}' && top == '{') ||
                        (ch == ']' && top == '[')){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return  stack.isEmpty();
    }
}