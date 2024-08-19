import javax.swing.JOptionPane;

public class EJ9 {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int i = 1;

        while (i<=10) {

            int resultado = n*i;
            i++;
            
            System.out.println("la tabla de multiplicar del numero "+n+ "es: " + resultado);
            
        }
    }
}
