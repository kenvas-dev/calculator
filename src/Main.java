import helpers.HandleSanner;

import java.util.Scanner;

public class Main {
    /**
     * Propiedad privada que delimita el rango menor de las opciones del menu de operaciones
     */
    private final static int minOptionSelected = 0;

    /**
     * Propiedad privada que delimita el rango mayor de las opciones del menu de operaciones
     */
    private final static int maxOptionSelected = 6;

    /**
     * Propiedad privada que asigna el valor de la opcion seleccionada,
     * del menu de operaciones
     */
    private static int optionSelected = 0;

    /**
     * Propiedad privada que asigna el valor de la opcion seleccionada,
     * del menu de continuar
     */
    private static int optionSelectedContinue = 0;

    /**
     * Propiedad privada que delimita continuar o no en las
     * opciones del menu de operaciones
     */
    private static boolean hasContinue = true;

    /**
     * Propiedad privada que se usa para solicitar datos por medios de la consola
     */
    private static Scanner sc = new Scanner(System.in);


    /**
     * @param args
     * @name main
     * @description Implementacion del programa
     */
    public static void main(String[] args) {
        CustomMessage.title("EJERCICIO CALCULADORA - KEVIN AQUINO");
        runCalculator();
    }

    /**
     * @name runCalculator
     * @description Metodo responsable de centralizar los metodos para poder hacer un calculo aritmetico.
     */
    private static void runCalculator() {

        while (true) {
            try {
                // Se muestra las opciones para realizar un calculo artimetico
                optionSelected = optionsBanner();
                if (optionSelected == minOptionSelected) {
                    CustomMessage.outln(new String[]{"Gracias por usar mi calculadora :D "});
                    break;
                }

                //Implementacion de la clase calculadora
                Calculadora calculadora = new Calculadora();

                // Se valida la opcion seleccionada
                // En base a la opcion seleccionada, se realiza el calculo
                while ((optionSelected > minOptionSelected && optionSelected <= maxOptionSelected) && hasContinue && (optionSelectedContinue >= 0 && optionSelectedContinue <= 1)) {
                    switch (optionSelected) {
                        case 1:
                            CustomMessage.outln(new String[]{"El resultado es: " + calculadora.suma()});
                            break;
                        case 2:
                            CustomMessage.outln(new String[]{"El resultado es: " + calculadora.resta()});
                            break;
                        case 3:
                            CustomMessage.outln(new String[]{"El resultado es: " + calculadora.multiplicacion()});
                            break;
                        case 4:
                            CustomMessage.outln(new String[]{"El resultado es: " + calculadora.division()});
                            break;
                        case 5:
                            CustomMessage.outln(new String[]{"El resultado es: " + calculadora.potencia()});
                            break;
                        case 6:
                            CustomMessage.outln(new String[]{"El resultado es: " + calculadora.raiz()});
                            break;

                    }

                    // Se consulta al ususario si desea continuar
                    optionsContinue();
                    while (optionSelectedContinue < 0 || optionSelectedContinue > 1) {
                        optionsContinue();

                    }
                    if (hasContinue) {
                        optionSelected = optionsBanner();

                        if (optionSelected == minOptionSelected) {
                            hasContinue = false;
                            break;
                        }
                    }
                    if (!hasContinue) break;
                }
                if (!hasContinue) {
                    CustomMessage.outln(new String[]{"Gracias por usar mi calculadora :D "});
                    break;
                }
            } catch (Exception e) {

                // Se emite un error controlado, si el usuario ingresa un valor no comprendido
                CustomMessage.outln(new String[]{"Al parecer insertaste un valor que no esta en el rango de opciones esperado"});
            }
        }
    }

    /**
     * @return int
     * @name optionsBanner
     * @description Metodo responsable de solicitar al usuario que opcion desea realizar,
     * de los procesos aritmeticos, donde:
     * 1). Suma
     * 2). Resta
     * 3). Multiplicacion
     * 4). Division
     * 5). Potencia
     * 6). Raiz cuadrada
     * 0). Finalizar"
     */
    private static int optionsBanner() {
        CustomMessage.outln(new String[]{"Selecciona una opcion del menu"});
        CustomMessage.outln(new String[]{"1). Suma", "2). Resta", "3). Multiplicacion", "4). Division", "5). Potencia", "6). Raiz cuadrada", "0). Finalizar"});
        int value = HandleSanner.getInt("El rango de opciones desde: 0 hasta: 6");
        try {
            return value;
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * @name optionsContinue
     * @description Metodo responsable de solicitar al usuario si desea continuar o no,
     * realizando procesos aritmeticos
     */
    private static void optionsContinue() {
        CustomMessage.outln(new String[]{"Desea continuar?"});
        CustomMessage.outln(new String[]{"1). Si", "0). No",});
        int option = HandleSanner.getInt("El rango de opciones desde: 0 hasta: 1");
        optionSelectedContinue = option;
        if (option == 0) {
            hasContinue = false;
        }
    }
}