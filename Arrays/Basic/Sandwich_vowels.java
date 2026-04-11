//For a given string s comprising only lowercase English alphabets,
// eliminate the vowels from the string that occur between two
// consonants(sandwiched between two immediately adjacent consonants).
// Return the new string.
//
//        Examples:
//
//Input : s = "bab"
//Output : bb
//Explanation: 'a' is a vowel occuring between two consonants i.e.
// b. Hence the updated string eliminates a.
//Input : s = "ceghij"
//Output : cghj
//Explanation: 'e' and 'i' are sandwitched vowels.
import java.lang.String;

public class Sandwich_vowels {
    public static void main(String[] args){
        String s = "ceghij";
        System.out.println("The result after removing vowels : " +removevowel(s));
    }

    public static String removevowel(String str){
        int n = str.length();
        if(n < 3) return str;

        StringBuilder sb = new StringBuilder();

        sb.append(str.charAt(0));

        for(int i=1; i<n-1; i++){
            char current = str.charAt(i);
            char prev = str.charAt(i-1);
            char next = str.charAt(i+1);

            if(isVowel(current) && !isVowel(prev) && !isVowel(next)){
                continue;
            }else{
                sb.append(current);
            }
        }
        sb.append(str.charAt(n-1));

        return sb.toString();
    }
    private static boolean isVowel(char c){
        return "aeiour".indexOf(c) != -1;
    }
}