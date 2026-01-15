//Given an array of car numbers car[], an array of penalties fine[],
//and an integer value date. The task is to find the total fine which
//will be collected on the given date. The fine is collected from
//odd-numbered cars on even dates and vice versa.

public class Find_the_fine{
    public static void main(String[] args){
        int date = 12;
        int[] car = {1231, 2323, 3454, 9898};
        int[] fine = {2311, 2300, 4500, 900};
        int result = find_fine(date, car, fine);
        System.out.println(result);
    }
    public static int find_fine(int date, int car[], int fine[]){
        int totalfine = 0;

        for(int i=0; i<car.length; i++){
            if(date % 2 == 0){
                if(car[i] % 2 != 0){
                    totalfine += fine[i];
                }
            }else{
                if(car[i] % 2 == 0){
                    totalfine += fine[i];
                }
            }
        }
        return totalfine;
    }
}