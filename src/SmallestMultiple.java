public class SmallestMultiple {
    public static void main(String[] args) {
        int c = 20;
        while(!evenlyDividable(c)){
            c++;
        }

        System.out.println(c);
    }

    private static boolean evenlyDividable(int n){
        
        
        for(int i=1; i<= 20; i++){
            if(n%i != 0) return false;
        }

        return true;
    }
}
