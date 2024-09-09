/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.ciclosIterativos;

/**
 *
 * @author Dell
 */
public class Calificaciones {
    private int numCal;
    private double Cal;

    public Calificaciones(int numCal, double Cal) {
        this.numCal = numCal;
        this.Cal = (Cal<0)?1:Cal;
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
    
    
    
}
