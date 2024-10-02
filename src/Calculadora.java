import java.util.Scanner;

/**
 * @name Calculadora
 * @description
 * En esta clase se realiza la ejecucion de
 * los calculos aritmeticos solicitados, los cuales son:
 * - SUMA
 * - RESTA
 * - MULTIPLICACION
 * - DIVISION
 * - POTENCIA
 * - RAIZ
 */
public class Calculadora {

    /**
     * Propiedad privada que se usa para solicitar el primer valor del calculo
     */
    private final String lblNumber1 = "Ingrese el primer numero";

    /**
     * Propiedad privada que se usa para solicitar el segundo valor del calculo
     */
    private final String lblNumber2 = "Ingrese el segundo numero";

    /**
     * Propiedad privada que se usa para mostrar una leyenda
     */
    private final String lblOption = "Ha seleccionado la opcion de ";

    /**
     * Propiedad privada que se usa para asignar el primer valor de lo solicitado pr la consola
     */
    private double number1 = 0;

    /**
     * Propiedad privada que se usa para asignar el segundo valor de lo solicitado pr la consola
     */
    private double number2 = 0;

    /**
     * Propiedad privada que se usa para solicitar datos por medios de la consola
     */
    private Scanner sc = new Scanner(System.in);


    /**
     * @name suma
     * @description
     * metodo responsable de realizar la operacion de la suma
     * @return number1 + number2;
     */
    public double suma() {
        getParameters("Suma", true);
        return number1 + number2;
    }

    /**
     * @name resta
     * @description
     * metodo responsable de realizar la operacion de la resta
     * @return number1 - number2
     */
    public double resta() {
        getParameters("Resta", true);
        return number1 - number2;
    }

    /**
     * @name multiplicacion
     * @description
     * metodo responsable de realizar la operacion de la multiplicacion
     * @return number1 * number2
     */
    public double multiplicacion() {
        getParameters("Multiplicacion", true);
        return number1 * number2;
    }

    /**
     * @name division
     * @description
     * metodo responsable de realizar la operacion de la division
     * @return number1 / number2
     */
    public double division() {
        getParameters("Division", true);
        if(number2 == 0){
            CustomMessage.outln(new String[]{"No se puede realizar una divisio entres '0'"});
            return 0;
        }
        return number1 / number2;
    }

    /**
     * @name potencia
     * @description
     * metodo responsable de realizar la operacion de la potencia.
     * Donde 'number1' es la base y 'number2' es el exponente
     * @return Math.pow(number1, number2)
     */
    public double potencia() {
        getParameters("Potencia", true);
        return Math.pow(number1, number2);
    }

    /**
     * @name raiz
     * @description
     * metodo responsable de realizar la operacion de la raiz de un numero
     * @return Math.sqrt(number1)
     */
    public double raiz() {
        getParameters("Raiz cuadrada", false);
        if(number1 < 0){
            CustomMessage.outln(new String[]{"Tienes que ingresar un numero igual o mayor a '0'"});
            return 0;
        }
        return Math.sqrt(number1);
    }

    /**
     * @name getParameters
     * @description
     * metodo responsable de solicitar los datos al usuario
     */
    public void getParameters(String operation, boolean hasMultipleOperation) {
        CustomMessage.outln(new String[]{lblOption + operation});
        CustomMessage.outln(new String[]{lblNumber1});
        number1 = sc.nextDouble();
        if (hasMultipleOperation) {
            CustomMessage.outln(new String[]{lblNumber2});
            number2 = sc.nextDouble();
        }
    }
}
