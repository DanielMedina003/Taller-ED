import javax.swing.JOptionPane;

public class EJ5 {
    public static void main(String[] args) {
        int n;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero de una cifra y positivo"));
               
        } while (n<0 || n>10);

        for (int i = 1; i <=10; i++) {

            int resultado = n*i;
            System.out.println(n+"*"+i+"="+ resultado);
            
        }
        
    }
}
