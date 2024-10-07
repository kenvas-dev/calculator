import helpers.HandleSanner;

import java.util.Scanner;

/**
 * @name Calculadora
 * @description En esta clase se realiza la implementacion de
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
    private Numero number1;

    /**
     * Propiedad privada que se usa para asignar el segundo valor de lo solicitado pr la consola
     */
    private Numero number2;

    /**
     * Propiedad privada que se usa para solicitar datos por medios de la consola
     */
    private Scanner sc;

    /**
     * Propiedad privada que se usa para instancia la Clase Operacion y tener su instancia de
     * manera global
     */
    private Operacion operacionImplement;


    Calculadora() {
        operacionImplement = new Operacion();
        number1 = new Numero();
        number2 = new Numero();
        sc = new Scanner(System.in);
    }

    /**
     * @return number1 + number2;
     * @name suma
     * @description metodo responsable de realizar la implementacion de la suma
     */
    public double suma() {
        getParameters("Suma", true);
        return operacionImplement.suma(number1.getNumero(), number2.getNumero());
    }

    /**
     * @return number1 - number2
     * @name resta
     * @description metodo responsable de realizar la implementacion de la resta
     */
    public double resta() {
        getParameters("Resta", true);
        return operacionImplement.resta(number1.getNumero(), number2.getNumero());
    }

    /**
     * @return number1 * number2
     * @name multiplicacion
     * @description metodo responsable de realizar la implementacion de la multiplicacion
     */
    public double multiplicacion() {
        getParameters("Multiplicacion", true);
        return operacionImplement.multiplicacion(number1.getNumero(), number2.getNumero());
    }

    /**
     * @return number1 / number2
     * @name division
     * @description metodo responsable de realizar la implementacion de la division
     */
    public double division() {
        getParameters("Division", true);
        if (number2.getNumero() == 0) {
            CustomMessage.outln(new String[]{"No se puede realizar una divisio entres '0'"});
            return 0;
        }
        return operacionImplement.division(number1.getNumero(), number2.getNumero());
    }

    /**
     * @return Math.pow(number1, number2)
     * @name potencia
     * @description metodo responsable de realizar la implementacion de la potencia.
     */
    public double potencia() {
        getParameters("Potencia", true);
        return operacionImplement.potencia(number1.getNumero(), number2.getNumero());
    }

    /**
     * @return Math.sqrt(number1)
     * @name raiz
     * @description metodo responsable de realizar la implementacion de la raiz de un numero
     */
    public double raiz() {
        getParameters("Raiz cuadrada", false);
        if (number1.getNumero() < 0) {
            CustomMessage.outln(new String[]{"Tienes que ingresar un numero igual o mayor a '0'"});
            return 0;
        }
        return operacionImplement.raiz(number1.getNumero(), number2.getNumero());
    }

    /**
     * @name getParameters
     * @description metodo responsable de solicitar los datos al usuario
     */
    public void getParameters(String operation, boolean hasMultipleOperation) {
        CustomMessage.outln(new String[]{lblOption + operation});
        CustomMessage.outln(new String[]{lblNumber1});
        double number1 = HandleSanner.getDouble("");
        this.number1.setNumero(number1);
        if (hasMultipleOperation) {
            CustomMessage.outln(new String[]{lblNumber2});
            double number2 = HandleSanner.getDouble("");
            this.number2.setNumero(number2);
        }
    }
}
