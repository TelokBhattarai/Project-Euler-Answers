public class SpecialPythagoreanTriples{
    public static void main(String[] args) {
        EuclidsFormula(100);
    }

    // Uses euclids formula to generate pythagorean triples

    public static void EuclidsFormula(int m){
        for(int i=2; i<=m; i++){
            for(int n=1; n<m; n++){
                if((i*i) - (n*n) <= 0) continue; // Skips invalid pythagorean triples 

                int a = (i*i) - (n*n);
                int b = 2*(i*n);
                int c = (i*i)+(n*n);


                if(a+b+c == 1000){
                    System.out.println(String.format("%d %d %d | %d",a,b,c, a*b*c));
                    return;
                }
            }
        }
    }
}