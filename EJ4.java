import javax.swing.JOptionPane;

public class EJ4 {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero aleatorio entre 0 y 9,999"));

        if (n<0 || n>10000) {
            JOptionPane.showMessageDialog(null, "El numero no se encuentra en el rango definido");
            
        }else if (n<10) {
            JOptionPane.showMessageDialog(null, "El numero tiene 1 cifra");
            
        }else if (n<100) {
            JOptionPane.showMessageDialog(null, "El numero tiene 2 cifras");

        }else if (n<1000) {
            JOptionPane.showMessageDialog(null, "El numero tiene 3 cifras");

        }else{
            JOptionPane.showMessageDialog(null, "El numero tiene 4 cifras");
        }
    }
}
