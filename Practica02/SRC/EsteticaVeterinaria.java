/**
 * Clase para modelar las estéticas veterinarias de la empresa.
 */
public class EsteticaVeterinaria {

    private int id;
    
    private String nombre;
    
    private String telefono;
    
    private String horaApertura;

    private String horaCierre;

    private double ingresos;
    
    private int cantConsultorios;
    
    private String estado;
    
    private String calle;
    
    private int numero;
    
    private String cp;

    /**
     * Constructor por defecto para la estética.
     */
    public EsteticaVeterinaria() {
    }

    /**
     * Constructor para la estética.
     * @param id ID de la estética.
     * @param nombre Nombre de la estética.
     * @param telefono Telefono de la estética.
     * @param horaApertura Hora de apertura de la estética.
     * @param horaCierre Hora de cierre de la estética.
     * @param ingresos Ingresos de la estética.
     * @param cantConsultorios Cantidad de consultorios de la estética.
     * @param estado Estado en el que se encuentra la estética.
     * @param calle Calle en la que se encuentra la estética de la estética.
     * @param numero Número en la que está ubicada la estética.
     * @param cp Código postal de la estética.
     */
    public EsteticaVeterinaria(int id, String nombre, String telefono, String horaApertura, String horaCierre, double ingresos, int cantConsultorios, String estado, String calle, int numero, String cp) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.ingresos = ingresos;
        this.cantConsultorios = cantConsultorios;
        this.estado = estado;
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
    }

    
    /** 
     * Regresa el ID.
     * @return ID de la estética.
     */
    public int getId() {
        return id;
    }

    
    /** 
     * Asigan el ID.
     * @param id ID de la estética.
     */
    public void setId(int id) {
        this.id = id;
    }

    
    /** 
     * Regresa el nombre
     * @return Nombre de la estética
     */
    public String getNombre() {
        return nombre;
    }

    
    /** 
     * Asigna el nombre
     * @param nombre Nombre de la estética.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * Regresa el teléfono
     * @return Teléfono de la estética.
     */
    public String getTelefono() {
        return telefono;
    }

    
    /** 
     * Asigna el teléfono
     * @param telefono Teléfono de la estética.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    /** 
     * Regresa la hora de apertura.
     * @return La hora de apertura.
     */
    public String getHoraApertura() {
        return horaApertura;
    }

    
    /** 
     * Asigan la hora de apertura.
     * @param horaApertura La hora de apertura.
     */
    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    
    /** 
     * Regresa la hora de cierre.
     * @return La hora de cierre.
     */
    public String getHoraCierre() {
        return horaCierre;
    }

    
    /** 
     * Asigna la hora de cierre.
     * @param horaCierre La hora de cierre.
     */
    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    
    /** 
     * Regresa los ingresos.
     * @return Los ingresos.
     */
    public double getIngresos() {
        return ingresos;
    }

    
    /** 
     * Asigna los ingresos.
     * @param ingresos Los ingresos.
     */
    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    
    /** 
     * Regresa la cantidad de consultorios.
     * @return La cantidad de consultorios.
     */
    public int getCantConsultorios() {
        return cantConsultorios;
    }

    
    /** 
     * Asigna la cantidad de consultorios.
     * @param cantConsultorios La cantidad de consultorios.
     */
    public void setCantConsultorios(int cantConsultorios) {
        this.cantConsultorios = cantConsultorios;
    }

    
    /** 
     * Regresa el estado en el que se encuentra.
     * @return El estado en el que se encuentra.
     */
    public String getEstado() {
        return estado;
    }

    
    /**
     * Asigna el estado en el que se encuentra.
     * @param estado El estado en el que se encuentra.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    /** 
     * Regresa la calle en la que se encuentra.
     * @return La calle en la que se encuentra.
     */
    public String getCalle() {
        return calle;
    }

    
    /** 
     * Asigna la calle en la que se encuentra.
     * @param calle La calle en la que se encuentra.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    
    /** 
     * Regresa el número en donde está ubicada.
     * @return El número donde está ubicada.
     */
    public int getNumero() {
        return numero;
    }

    
    /** 
     * Asigan el número donde está ubicada.
     * @param numero El número donde está ubicada.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    /** 
     * Regresa el Código postal.
     * @return El Código postal.
     */
    public String getCp() {
        return cp;
    }

    
    /** 
     * Asigna el Código postal.
     * @param cp El Código postal.
     */
    public void setCp(String cp) {
        this.cp = cp;
    }


}
