public class EJ10 {
    public static void main(String[] args) {
        // Definir el número de filas de la figura
        int[] numeroDeAsteriscos = {1, 4, 6, 9};

        // Recorrer cada valor del arreglo para imprimir las filas
        for (int i = 0; i < numeroDeAsteriscos.length; i++) {
            // Imprimir los asteriscos según el valor actual
            for (int j = 0; j < numeroDeAsteriscos[i]; j++) {
                System.out.print("*");
            }
            // Pasar a la siguiente línea después de imprimir los asteriscos
            System.out.println();
        }
    }
}