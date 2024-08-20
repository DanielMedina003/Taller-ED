import javax.swing.JOptionPane;

public class EJ9DoWhile {
    public static void main(String[] args) {
        

        // Pregunta al usuario por el número de tabla que desea ver
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de la tabla de multiplicar que deseas ver: "));
        int i = 1;

        // Ciclo do-while para mostrar la tabla de multiplicar
        do {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        } while (i <= 10);
    }
}