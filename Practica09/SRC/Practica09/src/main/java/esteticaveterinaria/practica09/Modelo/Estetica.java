package esteticaveterinaria.practica09.Modelo;

/**
 * 
 * @author The501st
 *
 */
public class Estetica {
    
    private String nombre;
    private String telefono;
    private String calle;
    private int numCalle;
    private String estado;
    private String codigoPostal;
    private String horaInicio;
    private String horaFin;
    private int numConsultorios;
    
    private int idEstetica;
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
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getCalle() {
        return calle;
    }
    public int getNumCalle() {
        return numCalle;
    }
    public String getEstado() {
        return estado;
    }
    public String getCodigoPostal() {
        return codigoPostal;
    }
    public String getHoraInicio() {
        return horaInicio;
    }
    public String getHoraFin() {
        return horaFin;
    }
    public int getNumConsultorios() {
        return numConsultorios;
    }
    public int getIdEstetica() {
        return idEstetica;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public void setNumCalle(int numCalle) {
        this.numCalle = numCalle;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    public void setNumConsultorios(int numConsultorios) {
        this.numConsultorios = numConsultorios;
    }
    public void setIdEstetica(int idEstetica) {
        this.idEstetica = idEstetica;
    }
    
    
    
   
    

}
