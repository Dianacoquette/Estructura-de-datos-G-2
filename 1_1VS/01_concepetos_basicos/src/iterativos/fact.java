package iterativos;

public class fact {
    private int n;

    public fact(){
        this.n = 1;
    }

    public fact(int n){
        this.n = (n<=0)?n:1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n<=0) {
            this.n = 1;
        } else {
            this.n = n;
        }
    }

    //metodos de trabajos

    private long Serie1(){
        long f = 0;
        for (int i = 1; i <=n; i++) {
            f+=i;
        }
        return f;
    }

    private long Factorial(){
     long r = 1;
     for (int i = 1; i <=n; i++) {
        r*=i;
     }

     return r;
    }

    public long calcularSerie(){
        return Serie1()/Factorial();
    }

    @Override
    public String toString() {
        
        return "el resultado de la serie es: "+this.calcularSerie();
    }
}
