package iterativos;
// :::PROGRAMA PARA CALCULAR EL FACTORIAL DE UN NUMERO ENTERO :::
// 1.REALIZAR LA VALIDACION PARA QUE LA VARIABLE DE INSTANCIA NUNCA SEA CERO 
// 2.REALIZAR UN METODO QUE CALCULE EL FACTORIAL, UTILIZANDO FOR 
// 3.realizar un metodo que calcule el factorial de forma inversa utilizandoun while
// f(1)=1
// f(2)=1*2

public class factorial {
    private int n;

    public factorial(){
        this.n = 1;
    }

    public factorial(int n){
        if (n>0) {
            this.n = n;
        } else {
            this.n = 1;
        }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n>0) {
            this.n = n;
        } else {
            this.n = 1;
        }
    }

    //metodo de trabajo
    public double calcularFact(){
        int r =1;
        for (int i = 1; i <=n; i++) {
          r*=i;
         
        }
        return r;
    }

    public long CalcularRev(){
        long r =1;
        int i = n;

        while (i>=1) {
            r*=i;
            i--;
        }
        return r;
    }

    @Override
    public String toString() {
        
        return "el factorial de : " + this.n + " es: "+this.calcularFact();
    }
    
}
