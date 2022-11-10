import javax.swing.DebugGraphics;

public class LargestPalindromeProduct {
    public static void main(String[] args) {
        int LargestPalindrome = 0;

        for(int i=999; i >= 100; i--){
            for(int j=999; j >= 100; j--){
                if(isPalindrome(i*j) && i * j > LargestPalindrome){
                    LargestPalindrome = i*j;
                };
            }
        }

        System.out.println(LargestPalindrome);
    }

    private static boolean isPalindrome(int n){
        return n == reverse(n);
    }

    private static int reverse(int n){
        int num = n;
        int reverse = 0;
        while(n > 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        
        return reverse;
    }

}
