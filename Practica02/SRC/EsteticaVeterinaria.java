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

    public EsteticaVeterinaria() {
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public int getCantConsultorios() {
        return cantConsultorios;
    }

    public void setCantConsultorios(int cantConsultorios) {
        this.cantConsultorios = cantConsultorios;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

}
