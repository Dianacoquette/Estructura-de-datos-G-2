package edu.mx.utt.ejercicios;

import javax.swing.JOptionPane;

public class Autos {
    private int ptsConta;

    public Autos() {
        this.ptsConta = (ptsConta <=0)?1:ptsConta;
    }

    public int getPtConta() {
        return ptsConta;
    }

    public void setPtConta(int ptConta) {
        this.ptsConta = ptConta;
    }

    //metdodo de trebajo

    public String PromContaminacion(){
        double Prom = 0.0;
        double Min = 0.0;
        double Max = 0.0;
        double res = 0.0;

        for (int i = 1; i <=25; i++) {
            ptsConta = Integer.parseInt(JOptionPane.showInputDialog("Introduce los puntos de contaminacion: "));
            if (i == 1) {
                Min = ptsConta;
                Max = ptsConta; 
            }else if (ptsConta < Min) {
                Min = ptsConta;
            }

            if (ptsConta > Max) {
                Max = ptsConta;
            }
            Prom+=ptsConta;
            
        }
        res = Prom/25;
        return  " el promedio de contaminacion es de: "+res+"\nlos puntos del carro que menos contamina es de: "+Min+ "\nEl carro que mas contamina es: "+Max;
    }
    

    

    
}
