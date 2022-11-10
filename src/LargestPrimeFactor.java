import java.math.BigInteger;
import java.util.*;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(getLargestFactor(600851475143L));
    }


    public static long getLargestFactor(Long n){
        long LargestPrimeFactor = 0L;

        for(int i=2; i<Math.sqrt(n); i++){
            if(n % i == 0 && isPrime(i)){
                if(i > LargestPrimeFactor) LargestPrimeFactor = i;
            }
        }

        return LargestPrimeFactor;
    }

    public static boolean isPrime(int n){
        for(int i=2; i<Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }

        return true;
    }
    
}
