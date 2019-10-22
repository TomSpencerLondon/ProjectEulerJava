public class Factorial {
    public int Add(int num){
        if(num == 1){
            return num;
        }else{
            return num * Add(num -1);
        }
    }
}
