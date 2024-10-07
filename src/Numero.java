/**
 * @name Numero
 * @description Clase Numero que permite crear un objeto
 * con sus propiedad 'numero'
 */
public class Numero {

    /**
     * Propiedad del tipo privada, que permite retornar
     * el valor asignado.
     */
    private double numero;

    Numero() {
        numero = 0;
    }

    /**
     * @return numero
     * @name getNumero
     * @description Permite obtener el valor de la propiedad privada
     * publicamente, cuando se instancia esta clase
     */
    public double getNumero() {
        return numero;
    }

    /**
     * @return numero
     * @name setNumero
     * @description Permite asignar el valor de la propiedad privada
     * publicamente, cuando se instancia esta clase
     */
    public void setNumero(double numero) {
        this.numero = numero;
    }
}
