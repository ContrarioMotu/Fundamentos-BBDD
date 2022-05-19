package esteticaveterinaria.practica09.Modelo;

/**
 * Clase que describe a las esteticas
 * @author The501st
 *
 */
public class Estetica {
    private int idEstetica;
    private String nombre;
    private String telefono;
    private String calle;
    private int numCalle;
    private String estado;
    private String codigoPostal;
    private String horaInicio;
    private String horaFin;
    private int numConsultorios;
    
    /**
     * Constructor con todos los atributos
     * @param idEstetica el id de la estetica
     * @param nombre el nombre de la estetica
     * @param telefono el telefono de la estetica
     * @param calle la calle de la estetica
     * @param numCalle el numero de calle de la estetica
     * @param estado el estado de la estetica
     * @param codigoPostal el cp de la estetica
     * @param horaInicio la hora a la que abre la estetica
     * @param horaFin la hora a la que cierra la estetica 
     * @param numConsultorios el num de consultorios
     */
    public Estetica(int idEstetica, String nombre, String telefono, String calle, int numCalle, String estado,
            String codigoPostal, String horaInicio, String horaFin, int numConsultorios) {
        this.idEstetica = idEstetica;
        this.nombre = nombre;
        this.telefono = telefono;
        this.calle = calle;
        this.numCalle = numCalle;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.numConsultorios = numConsultorios;
    }
    
    /**
     * Constructor vacio para construir poco a poco
     */
    public Estetica() {
	
    }
    
    /**
     * 
     * @return el id de la estetica
     */
    public int getIdEstetica() {
        return idEstetica;
    }
    
    /**
     * 
     * @return el nombre de la estetica
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * 
     * @return el telefono de la estetica
     */
    public String getTelefono() {
        return telefono;
    }
    
    /**
     * 
     * @return la calle de la estetica
     */
    public String getCalle() {
        return calle;
    }
    
    /**
     * 
     * @return num calle de la estetica
     */
    public int getNumCalle() {
        return numCalle;
    }
    /**
     * 
     * @return el estado de la estetica 
     */
    public String getEstado() {
        return estado;
    }
    /**
     * 
     * @return el cp de la estetica
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }
    /**
     * 
     * @return la hora de apertura de la estetica 
     */
    public String getHoraInicio() {
        return horaInicio;
    }
    /**
     * 
     * @return la hora de cierre de la estetica 
     */
    public String getHoraFin() {
        return horaFin;
    }
    /**
     * 
     * @return num consultorios de la estetica 
     */
    public int getNumConsultorios() {
        return numConsultorios;
    }
    /**
     * Modifica el nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Modifica el telefono
     * @param telefono 
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * Modifica la calle
     * @param calle 
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }
    /**
     * Modifica el num calle
     * @param numCalle 
     */
    public void setNumCalle(int numCalle) {
        this.numCalle = numCalle;
    }
    /**
     * Modifica el estado
     * @param estado 
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * Modifica el cp
     * @param codigoPostal 
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    /**
     * Modifica la hora de apertura
     * @param horaInicio 
     */
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    /**
     * Modifica la hora de cierre
     * @param horaFin 
     */
    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    /**
     * Modifica el num consultorios
     * @param numConsultorios 
     */
    public void setNumConsultorios(int numConsultorios) {
        this.numConsultorios = numConsultorios;
    }
    /**
     * Modifica el id 
     * @param idEstetica 
     */
    public void setIdEstetica(int idEstetica) {
        this.idEstetica = idEstetica;
    }
    
    @Override
    /**
     * Representación en cadena
     * @return 
     */
    public String toString() {
        return "Estetica{" + "idEstetica=" + idEstetica + ", nombre=" + nombre + ", telefono=" + telefono + ", calle=" + calle + ", numCalle=" + numCalle + ", estado=" + estado + ", codigoPostal=" + codigoPostal + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", numConsultorios=" + numConsultorios + '}';
    }
    
    
    
   
    

}
