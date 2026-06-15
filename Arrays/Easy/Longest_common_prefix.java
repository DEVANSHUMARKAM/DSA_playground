public class Longest_common_prefix {
    public static void main(String[] args){

        String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String result = longestprefix(arr);
        System.out.println("The output: " +result);
    }
    public static String longestprefix(String arr[]){
        if(arr == null || arr.length == 0){
            return "";
        }

        String baseline = arr[0];

        for(int i=0; i<baseline.length(); i++){
            char c = baseline.charAt(i);

            for(int j=1; j<arr.length; j++){
                if(i == arr[j].length() || arr[j].charAt(i) != c){
                    return baseline.substring(0,i);
                }
            }
        }
        return baseline;
    }
}