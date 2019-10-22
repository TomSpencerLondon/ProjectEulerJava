import java.util.ArrayList;

public class Fibonacci {
    public int Sequence(int num){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(num == 0){
            return 0;
        }else if(num == 1){
            return 1;
        }else {
            list.add((Sequence(num - 1) + Sequence(num - 2)));
        }
        return list.get(list.size() - 1);
    }
}
