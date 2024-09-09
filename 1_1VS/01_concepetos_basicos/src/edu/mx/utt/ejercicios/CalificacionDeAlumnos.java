package edu.mx.utt.ejercicios;

import javax.swing.JOptionPane;

public class CalificacionDeAlumnos {
    private int nAlum;
    private double cal;

    public CalificacionDeAlumnos() {
        this.nAlum = nAlum;
        this.cal = cal;
    }

    
    public int getnAlum() {
        return nAlum;
    }


    public void setnAlum(int nAlum) {
        this.nAlum = nAlum;
    }

    public double getCal() {
        return cal;
    }

    public void setCal(double cal) {
        this.cal = cal;
    }

    //metodo de trabajo
    public double MediaCalificaciones() {
        double med = 0.0;
        double r = 0.0;
        double promMenor = 0.0;
        for (int i = 1; i <=nAlum; i++) {
            cal = Double.valueOf(JOptionPane.showInputDialog("introduce la calificacion "+i+" : "));
            if (i == 1) {
                promMenor = cal;
            }else if (cal<promMenor) {
                promMenor = cal;
            }
            med += cal;
        }
            r=med/nAlum;
        return r + promMenor;
    }


    @Override
    public String toString() {
        return "la calificacion promedio  de el grupo es de: "+ this.MediaCalificaciones();
    }

    
    
}
