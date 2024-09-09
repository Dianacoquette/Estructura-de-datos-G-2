package iterativos;

public class SerieFactorial {
 private int n;
 
 public SerieFactorial(){
    this.n = 1;
 }

public int getN() {
    return n;
}

public void setN(int n) {
    this.n = (n>0)?n:1;


 
}
public double Calcular(){
    double r = 0.0;
    int i = 1;
    do {
        r+=i/this.Fact();
    } while (i<=this.n);
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
