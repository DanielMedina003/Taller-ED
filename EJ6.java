import javax.swing.JOptionPane;

public class EJ6 {

    public static void main(String[] args) {

        // Solicitar al usuario el valor de n
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        int contadorPrimos = 0;

        // Contar los números primos entre 1 y n
        for (int i = 2; i <= n; i++) {
            int divisores = 0;

            // Verificar si el número i es primo
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }

            // Un número es primo si solo tiene 2 divisores: 1 y sí mismo
            if (divisores == 2) {
                contadorPrimos++;
            }
        }

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "Hay " +contadorPrimos+" numeros primos entre 1 y "+n);

    }
}

