import javax.swing.JOptionPane;

public class EJ9 {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int i = 1;

        while (i<=10) {

            System.out.println(n+ "x" +i+ "=" + (n*i));
            i++;
            
        }
    }
}
