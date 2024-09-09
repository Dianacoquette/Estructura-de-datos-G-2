package edu.mx.utt.ejercicios;

import javax.swing.JOptionPane;

import iterativos.factorial;

public class Calificaciones {
    private int numCal = 0;
    private double Cal = 0.0;

    public Calificaciones() {
        if (Cal >10) {
            System.out.println("la calificacion es invalida, tiene que ser un numero entre 0 y 10");
        } else {
            this.Cal = (Cal<0)?1:Cal;
        }
    
        
    }

    public double getCal() {
        return Cal;
    }

    public void setCal(double Cal) {
        this.Cal = (Cal<0)?1:Cal;
    }

    public int getNumCal() {
        return numCal;
    }

    public void setNumCal(int numCal) {
        this.numCal = numCal;
    }
    
    //metodo de trabajo

    public double PromedioDeCalificaciones(){
        double r=0.0;
        double sum=0.0;
        for (int i = 1; i <=numCal; i++) {
            Cal = Integer.parseInt(JOptionPane.showInputDialog("ingresa la calificacion: "+i));
            sum+=Cal;
            
        }
                r=sum/numCal;
            return r;
    }
}
