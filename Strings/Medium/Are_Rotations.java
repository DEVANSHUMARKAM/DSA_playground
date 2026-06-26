import java.util.Arrays;
import java.lang.String;

public class Are_Rotations {
    public static void main(String[] args){
        String s1 = "abcd";
        String s2 = "cdab";
        boolean result = areRotations(s1, s2);
        System.out.println("the result is : " +result);
    }
    public static boolean areRotations(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        if(s1.equals(s2)){
            return true;
        }

        String txt = s1 + s1;
        String pat = s2;

        return kmpSearch(txt, pat);
    }

    public static boolean kmpSearch(String txt, String pat){
        int M = pat.length();
        int N = txt.length();

        int[] lps = new int[M];
        computeLPSarray(pat, M, lps);

        int i=0;
        int j=0;

        while(i<N){
            if(pat.charAt(j) == txt.charAt(i)){
                i++;
                j++;
            }
            if(j == M){
                return true;
            }
            else if(i<N && pat.charAt(j) != txt.charAt(i)){
                if(j != 0){
                    j = lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return false;
    }
    public static void computeLPSarray(String pat, int M, int[] lps){
        int len = 0;
        int i=1;
        lps[0] = 0;

        while(i<M){
            if(pat.charAt(i) == pat.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len != 0){
                    len = lps[len-1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}