package edu.mx.utt.ejercicios;

public class TablaDeMultiplicacion {
   private int n;

    public TablaDeMultiplicacion(int n) {
        this.n = (n<=0)?1:n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n<=0)?1:n;
    }

    //Metodo De Trabajo

    public int CalcularMultiplicacion(){
        int r = 1;
        for (int i = 1; i <= 10; i++) {
            r=n*i;

           System.out.println(n+"X"+i+"="+r);
        }
        return r;
    }

    
}
