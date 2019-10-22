public class Gauss {
    public int sum(int num){
        int n = num - 1;
        int result = num + (n * ((n + 1) / 2));
        return result;
    }
}
