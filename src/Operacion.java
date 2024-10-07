
/**
 * @name Calculadora
 * @description En esta clase se realiza la ejecucion de
 * los calculos aritmeticos solicitados, los cuales son:
 * - SUMA
 * - RESTA
 * - MULTIPLICACION
 * - DIVISION
 * - POTENCIA
 * - RAIZ
 */
public class Operacion {

    /**
     * @return number1 + number2;
     * @name suma
     * @description metodo responsable de realizar la operacion de la suma
     */
    public double suma(double number1, double number2) {
        try {
            return number1 + number2;
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * @return number1 - number2
     * @name resta
     * @description metodo responsable de realizar la operacion de la resta
     */
    public double resta(double number1, double number2) {
        try {
            return number1 - number2;
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * @return number1 * number2
     * @name multiplicacion
     * @description metodo responsable de realizar la operacion de la multiplicacion
     */
    public double multiplicacion(double number1, double number2) {
        try {
            return number1 * number2;
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * @return number1 / number2
     * @name division
     * @description metodo responsable de realizar la operacion de la division
     */
    public double division(double number1, double number2) {
        try {
            return number1 / number2;
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * @return Math.pow(number1, number2)
     * @name potencia
     * @description metodo responsable de realizar la operacion de la potencia.
     * Donde 'number1' es la base y 'number2' es el exponente
     */
    public double potencia(double number1, double number2) {
        try {
            return Math.pow(number1, number2);
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * @return Math.sqrt(number1)
     * @name raiz
     * @description metodo responsable de realizar la operacion de la raiz de un numero
     */
    public double raiz(double number1, double number2) {
        try {
            return Math.sqrt(number1);
        } catch (Exception e) {
            return 0;
        }
    }

}
