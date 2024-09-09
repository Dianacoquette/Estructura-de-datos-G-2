package edu.mx.utt.ejercicios;

import javax.swing.JOptionPane;

public class Suma {
    private double Cant;

    public Suma() {
        
    }

    public double getCant() {
        return Cant;
    }

    public void setCant(double cant) {
        Cant = cant;
    }

   //Metodo de trabajo

   public double sumar(){
    double result = 0.0;

    for (int i = 0; i <=10; i++) {
        Cant = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad: "));
        result+=Cant;
    }
    return result;
   }

@Override
public String toString() {
    return "El reultado es: "+this.sumar();
}

    

    
}
