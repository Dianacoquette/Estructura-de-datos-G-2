package iterativos;

public class Potencia {
    private double b;
    private double n;
    //cotrutores
    public Potencia(double b, double n){
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

    //metodos
    
    public double CalcularFactorialFor(){
       double r = 1;
        for (int i = 1; i <=n; i++) {
            r*=b;
        }

        return r;
    }

    public double CalcularFactorialWhile(){
        int i = 1;
        double r = 1;
        while (i <=n ) {
            r*=b;
            i++;
        }
        return r;
    }

    public double CalcularFactorialDoWhile(){
        double r = 1;
        int i = 1;
        do {
            r*=b;
        } while (i <=n);
        return r;
    }
    

}
