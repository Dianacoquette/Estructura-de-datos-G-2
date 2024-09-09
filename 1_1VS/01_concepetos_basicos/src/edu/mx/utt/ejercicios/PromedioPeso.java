package edu.mx.utt.ejercicios;

import javax.swing.JOptionPane;

public class PromedioPeso {
    private int num;
    private int edad;
    private double peso;
    public PromedioPeso(int num, int edad, double peso) {
        this.peso = (peso<=0)?1:peso;
        this.num = (num<=0)?1:num;
        this.edad = (edad<0)?1:edad;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = (num<=0)?1:num;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = (edad<0)?1:edad;

    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = (peso<=0)?1:peso;
    }
    

    //metodo

    public double PromedioPeso(){
        double prom = 0.0;
        double r = 0.0;
        if (edad >=0 || edad <=12) {
            for (int i = 0; i <=num ; i++) {
                peso = Double.parseDouble(JOptionPane.showInputDialog("ingresa el peso del niño:"))
                prom +=peso;
            }
            return r=peso/num;
        }else if (edad >=13 ||  edad <=29){
            for (int i = 0; i <=num ; i++) {
                peso = Double.parseDouble(JOptionPane.showInputDialog("ingresa el peso del Joven:"));

                prom +=peso;
            }
        }else if (edad >=30 || edad <=59){
            for (int i = 0; i <=num ; i++) {
                peso = Double.parseDouble(JOptionPane.showInputDialog("ingresa el peso del Adulto:"));
                    
                prom +=peso;
            }
        }
        return r=peso/num;
    }


    

}
