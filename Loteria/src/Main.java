
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v;
        v = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros para el arreglo: "));
        double[] numeros;
        numeros = new double[v];
        Numeros a = new Numeros();
        Random t = new Random();
        a.Sorteo();
        double n;

        for (int i = 0; i < v; i++) {

            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

            //TABLA
            numeros[i] = n;

            ///VERIFICACION----------------------------------------------------------------           
            for (int j = 0; j < n; j++) {
                int li;
                li = j;
                if (li-1 == n ) {
                    JOptionPane.showMessageDialog(null, "NUMERO REPETIDO, ingrese por favor otro numero");
                    System.out.println(n);
                }
            }

            //-------------------------------------------------------------------------------
            if (n == t.nextInt(v)) {
                System.out.println("Ganaste");
                System.out.println(n);
                JOptionPane.showMessageDialog(null, "FELICIDADES NÚMERO ACERTADO");
            } else {
                System.out.println("Perdiste");
                System.out.println(n);
                JOptionPane.showMessageDialog(null, "NUMERO NO ACERTADO, NO TE RINDAS!");

            }

        }
    }
}
