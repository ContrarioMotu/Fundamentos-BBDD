/**
 * Clase para modelar las tarjetas de crédito de los clientes de la empresa.
 */
public class Tarjeta {

    private int idtarjeta;
    private String numtarjeta;
    private String vencimiento;
    private String cvv;
    private String curp;

    public Tarjeta() {
    }

    /**
     * Constructor para Tarjeta.
     * 
     * @param idtarjeta id de la tarjeta del cliente.
     * @param numtarjeta numero de la tarjeta del cliente.
     * @param vencimiento vencimiento de la tarjeta.
     * @param cvv eñ cvv de la tarjeta
     * @param curp Curp del cliente.
     */
    public Tarjeta(int idtarjeta, String numtarjeta, String vencimiento, String cvv, String curp) {
        this.idtarjeta = idtarjeta;
        this.numtarjeta = numtarjeta;
        this.vencimiento = vencimiento;
        this.cvv = cvv;
        this.curp = curp;
    }

    /**
     * Regresa el ID de la tarjeta.
     * @return El ID de la tarjeta.
     */
    public int getIdTarjeta() {
        return idtarjeta;
    }

    /**
     * Regresa el numero de la tarjeta.
     * @return El número de la tarjeta.
     */

    public String getNumTarjeta() {
        return numtarjeta;
    }

    /**
     * Regresa el vencimiento de la tarjeta
     * @return La fecha de vencimiento de la tarjeta.
     */
    public String getVencimiento() {
        return vencimiento;
    }

    /**
     * Regresa el CURP del titular de la tarjeta.
     * @return El CURP del titular.
     */
    public String getCurp() {
        return curp;
    }

    /**
     * Asigna el ID de la tarjeta
     * @param idtarjeta El ID de la tarjeta
     */
    public void setIdTarjeta(int idtarjeta) {
        this.idtarjeta = idtarjeta;

    }

    /**
     * Asigna el numero de tarjeta
     * @param numtarjeta El número de la tarjeta
     */
    public void setNumTarjeta(String numtarjeta) {
        this.numtarjeta = numtarjeta;
    }

    /**
     * Asigna la fecha de vencimiento de la tarjeta.
     * @param vencimiento La fecha de vencimiento de la tarjeta
     */
    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    /**
     * Asigna el CURP del titular de la tarjeta
     * @param curp El CURP del titular de la tarjeta
     */
    public void setCurp(String curp) {
        this.curp = curp;
    }

    /**
     * Getter del cvv de la tarjeta
     * @return el cvv de la tarjeta
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * Setter del cvv de la tarjeta
     * @param cvv nuevo valor del cvv de la tarjeta
     */
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

}
