package iterativos;

public class Serie3 {
    private double b;
    private double n;

    public Serie3(double b, double n){
        if (n<=0 && b<=0) {
            this.n = 1;
            this.b = 1;
        } else {
            this.n = n;
            this.b = b;
        }


    }
    public double getB() {
        return b;
    }
    public void setB(int b) {
        this.b = (b<=0)?1:b;
    }
    public double getN() {
        return n;
    }
    public void setN(int n) {
        this.n = (n<=0)?1:n;
    }

    public double CalcularSerie(){
        
    }

    private double CalcularFactorialFor(){
        double r = 1;
         for (int i = 1; i <=n; i++) {
             r*=b;
         }
 
         return r;
     }

     private double Fact(){
        int r =1;
        for (int i = 1; i <=n; i++) {
          r*=i;
         
        }
        return r;
    }


}
