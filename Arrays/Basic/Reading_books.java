//There are some kinds of books. Geek has to choose a book of a particular kind and read it loudly as many times as he can in the given time and earn points. Geek knows that reading a book of kind i once needs arr1i minutes and it will give him arr2i points. Geek has k minutes for reading books. During this time, he can only read a book of a particular kind as many times as he can so as to maximize his points. But he can not pick books of different kinds. Find the maximum points Geek can get.
//
//        Examples:
//
//Input: k = 10, arr1 = [3, 4, 5], arr2 = [4, 4, 5]
//Output: 12
//Explanation: If Geek picks book of first kind he can read it 3 times, he will get 3*4 = 12 points. If Geek picks book of second kind he can read it 2 times, he will 2*4 = 8 points. If Geek picks book of third kind he can read it 2 times, he will get 2*5 = 10 points. So the maximum possible points which he can earn in those 10 minutes is 12.
//Input: k = 12, arr1 = [8, 5], arr2 = [100, 5]
//Output: 100
//Explanation: If Geek picks book of first kind he can read it 1 times, he will get 100*1 = 100 points. If Geek picks book of second kind he can read it 2 times, he will 5*2 = 10 points. So the maximum possible points which he can earn in those 12 minutes is 100.

public class Reading_books {
    public static void main(String[] args){
        int k = 10;
        int[] arr1 = {3,4,5};
        int[] arr2 = {4,4,5};
        System.out.println("The max points is : " +findmaxpoint(k,arr1,arr2));
    }

    public static int findmaxpoint(int k , int[] arr1, int[] arr2){
        int maxpoint = 0;
        int n = arr1.length;

        for(int i=0; i<n; i++) {
            int timeperbook = arr1[i];

            int pointsperbook = arr2[i];

            int count = k / timeperbook;

            int currentpoint = count * pointsperbook;

            if(currentpoint > maxpoint){
                maxpoint = currentpoint;
            }
        }
        return maxpoint;
    }
}