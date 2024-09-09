package edu.mx.utt.ejercicios;

import javax.swing.JOptionPane;

public class Naranjas {
    private double kg;

    public Naranjas() {
        this.kg = (kg<=0.0)?1:kg;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = (kg<=0.0)?1:kg;
    }

        //metodo de trabajo

        public double NaranjasCal(){
            double desc = 0.15;
            double tot = 0.0;
            double perci = 0.0;
            double subtot = 0.0;
            for (int i = 0; i <=15; i++) {
                kg = Double.parseDouble(JOptionPane.showInputDialog("Kilos"));

                if (kg > 10.0) {
                     subtot = (20.0*kg)*desc;
                    tot = subtot - desc; 
                    perci+=tot;
                    System.out.println("totala pagar: $"+tot);
                }else{
                    tot = 20.0*kg;
                    perci+=tot;

                    System.out.println("total a pagar: $"+tot);
                }

                
            }
            return perci;
        }
    

    
}
