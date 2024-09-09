package edu.mx.utt.ejercicios;
import javax.swing.JOptionPane;
public class PruebaCalificaciones {
    public static void main(String[] args) {
        Calificaciones cal = new Calificaciones();
        
        cal.setNumCal(Integer.parseInt(JOptionPane.showInputDialog("numero de calificacioes: ")));
       
            JOptionPane.showMessageDialog(null,"el promedio es: "+cal.PromedioDeCalificaciones());
        
    }
}
