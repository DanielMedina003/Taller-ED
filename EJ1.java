import javax.swing.JOptionPane;

public class EJ1 {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero aleatorio"));
       
        if ((n>=51) && (n<=100)) {

            JOptionPane.showMessageDialog(null, "El numero ingresado se encuentra en el intervalo [51-100]");
            
        } else {

            JOptionPane.showMessageDialog(null, "El numero ingresado no se encuentra en el intervalo [51-100]");
            
        }
    }
}