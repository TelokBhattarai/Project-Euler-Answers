public class SumSquareDifference{
    public static void main(String[] args) {
        System.out.println(getSquareOfSum(100) -getSumOfSquare(100));
    }

    public static int getSumOfSquare(int n){
        int sum = 0;
       
        for(int i=1; i<= n; i++){
            sum += i*i;
        }

        return sum;
    }

    public static int getSquareOfSum(int n){
        int sum = 0;

        for(int i =1; i<=n; i++){
            sum+=i;
        }

        return sum*sum;
    }
}