package helpers;

import java.util.Scanner;

/**
 * Clase que implementa el uso del Scanner con su respectivas validaciones
 */
public class HandleScanner {

    /**
     * @param customMessage String
     * @return int
     * @name getInt
     * @description Metodo estatico, que implementa validaciones a nivel de consola para los valores que
     * ingresa los usuario, si dicho valor no es del tipo solicitado, se solicita nuevamente
     */
    public static int getInt(String customMessage) {
        Scanner sc = new Scanner(System.in);
        do {
            if (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    return sc.nextInt();
                } else {
                    sc.next();
                    System.out.println("No ha introducido un número.");
                    System.out.println("Favor introducir un número del menu de arriba: ");
                    System.out.println(customMessage);
                }
            } else {
                return 0;
            }
        } while (true);
    }

    /**
     * @param customMessage String
     * @return double
     * @name getDouble
     * @description Metodo estatico, que implementa validaciones a nivel de consola para los valores que
     * ingresa los usuario, si dicho valor no es del tipo solicitado, se solicita nuevamente
     */
    public static double getDouble(String customMessage) {
        Scanner sc = new Scanner(System.in);
        do {
            if (sc.hasNext()) {
                if (sc.hasNextDouble()) {
                    return sc.nextDouble();
                } else {
                    sc.next();
                    System.out.println("No ha introducido un número.");
                }
            } else {
                return 0;
            }
        } while (true);
    }
}
