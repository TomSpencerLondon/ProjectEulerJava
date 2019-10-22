public class p001 {
    public int SumMultiples(int i){
        int n = i - 1;
        int result = (3 * gauss(n/3)) + (5 * gauss(n/5)) - (15 * gauss(n/15));
        System.out.println(result);
        return result;
    }

    private int gauss(int n){
        int result = ((n * (n + 1))/ 2);
        return result;
    }
}
