public class Prime10001st {
    public static void main(String[] args) {
        int pc = 2;
        int n = 4;

        while(pc != 10001){
            if(isPrime(n)){
                pc++;
                System.out.println(n + " " + pc);
            }
            n++;
        }

    }

    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }

        return true;
    }

}
