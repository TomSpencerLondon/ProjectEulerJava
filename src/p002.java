public class p002 {
    public int SumEvens(int num){
        int firstOdd,secondOdd;
        firstOdd = secondOdd = 1;
        int total = 0;
        int even = firstOdd + secondOdd;

        while(even < num){
            total += even;
            firstOdd = even + secondOdd;
            secondOdd = even + firstOdd;
            even = firstOdd + secondOdd;
            }
        return total;
    }
}
