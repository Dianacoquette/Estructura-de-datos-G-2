package iterativos;
import javax.swing.JOptionPane;
public class mainSerieFact {
    public static void main(String[] args) {
      menu();

      if (resultado == 0.0) {
        JOptionPane.showMessageDialog(null, "opcion no valida");
      }else{
        JOptionPane.showMessageDialog(resultado);
      }
    }

    public static String menu(){
        String menu = "Menu Principal"+"\nn"+
        "1-.Serie1\n"+
        "2-.Serie2\n"+
        "3-.Factorial\n"+
        "4-.Potencia\n"+
        "5-.Serie3\n"+
        "Elige una opcion: "
        ;

        return JOptionPane.showInputDialog(menu);
    }
    public static double GestOP(String op){
        double re = 0.0;
        int valor = 0;
        switch (op) {
            case "1":
                Serie2 serie = new Serie2();
                valor = Integer.parseInt(JOptionPane.showInputDialog("ingrese n: ");
                serie.setN(valor));
                
                re = serie.Calcular2();
                break;
            case "2":

            break;
            case "3":

            break;

            case "4":

            break;

            case "5": 

            break;

            case "6":

            break;
            default:
            System.out.println("no hay");
                break;
        }
        return re;
    }
}
