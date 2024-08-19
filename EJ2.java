import javax.swing.JOptionPane;

public class EJ2 {

    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero aleatorio"));

        if (n<0) {

           JOptionPane.showMessageDialog(null, "El numero es negativo");
            
        } else if (n>100) {

            JOptionPane.showMessageDialog(null, "El numero es superior a 100");
            
        } else {

            JOptionPane.showMessageDialog(null, "El numero se encuentra entre 0-100");
            
        }
    }
    
}
