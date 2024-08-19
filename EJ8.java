import javax.swing.JOptionPane;

public class EJ8 {
    public static void main(String[] args) {

        int SumaEdades= 0;
        int Mayores50= 0;
        int ContadorEdades = 0;

        //Bucle para ingresar edades
        while (true) {

            int Edad = Integer.parseInt(JOptionPane.showInputDialog("Digite una edad (0 para finalizar)"));

            if (Edad == 0) {
                break;
            }

            //Almacena edades mayores a 50
            if (Edad > 50) {
                Mayores50++;
            }

            //Sumamos la cantidad de edades que se ingresaron
            SumaEdades += Edad;
            ContadorEdades++;

        }

        //Promedio de edades y porcentaje de edades mayores a 50
        if (ContadorEdades > 0) {
            double PromedioE = (double)SumaEdades/ContadorEdades;
            double PorcentajeMC = (double)Mayores50/ContadorEdades*100;

            JOptionPane.showMessageDialog(null, "El promedio de edades es: "+PromedioE+ "\n" 
            + "El porcentaje de las personas mayores a 50 años es: "+PorcentajeMC);
            
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron edades");
            
        }

        
    }
}
