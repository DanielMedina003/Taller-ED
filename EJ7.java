import javax.swing.JOptionPane;

public class EJ7 {
    public static void main(String[] args) {
        int n;

        //Validar si es positivo
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero positivo "));

            if (n<0) {

                JOptionPane.showMessageDialog(null, "               ¡ERROR!\n El numero debe ser positivo");
            }
            
        } while (n<0);

        if (n>60 && n<90) {
            JOptionPane.showMessageDialog(null, "EL numero se encuentra entre el intervalo 60-90");
            
        } else {
            JOptionPane.showMessageDialog(null, "                              ¡ERROR!\n El numero no se encuentra entre el intervalo 60-90");
        }
    
    
    }
}
