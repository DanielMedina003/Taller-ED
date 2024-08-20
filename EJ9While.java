import javax.swing.JOptionPane;

public class EJ9While {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de la tabla de multiplicar que deseas ver: "));
        int i = 1;

        while (i<=10) {

            System.out.println(n+ "x" +i+ "=" + (n*i));
            i++;
            
        }
    }
}

