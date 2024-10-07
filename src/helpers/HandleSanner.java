package helpers;

import java.util.Scanner;

public class HandleSanner {

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
