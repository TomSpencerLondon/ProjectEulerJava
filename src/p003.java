public class p003 {
    public long FirstPrime(long number){
        if(prime(number)){
            return number;
        }
        return FirstPrime(number - 1);
    }

    private boolean prime(long number){
        if(number % 2 == 0){
            return number == 2;
        }

        int [] a = new int[100];

        for (int i = 2;i < Math.sqrt(number);++i){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

}

