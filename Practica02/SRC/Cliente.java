/**
 * Clase para modelar a los clientes de la empresa.
 */
public class Cliente {

    String curp;
    String apellidoPaterno;
    String apellidoMaterno;
    String nombre;
    String estado;
    String calle;
    int calleNum;
    String cp;
    String email;
    String telefono;
    String fechaNac;

    public Cliente() {
    }

    /**
    * Constructor para clientes.
    * @param curp CURP del cliente.
    * @param apellidoPaterno Apellido paterno del cliente.
    * @param apellidoMaterno Apellido materno del cliente.
    * @param nombre Nombre del cliente.
    * @param estado Estado donde vive el cliente
    * @param calle Calle donde vive el cliente.
    * @param calleNum Numero de donde vive el cliente.
    * @param cp Código postal del cliente.
    * @param email e-mail del cliente.
    * @param telefono Teléfono del cliente.
    * @param fechaNac Fecha de nacimiento del cliente.
    */
    public Cliente(String curp, String apellidoPaterno, String apellidoMaterno, String nombre, String estado,
                   String calle, int calleNum, String cp, String email, String telefono, String fechaNac) {
        this.curp = curp;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombre = nombre;
        this.estado = estado;
        this.calle = calle;
        this.calleNum = calleNum;
        this.cp = cp;
        this.email = email;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
    }

    /**
    * Regresa el nombre
    * @return Nombre del cliente.
    */
    public String getNombre() {
    return nombre;
    }

    /**
    * Regresa el apellido paterno
    * @return Apellido paterno del cliente.
    */
    public String getApellidoPaterno() {
    return apellidoPaterno;
    }

    /**
    * Regresa el apellido materno
    * @return Apellido materno del cliente.
    */
    public String getApellidoMaterno() {
    return apellidoMaterno;
    }

    /**
    * Regresa el CURP
    * @return CURP del cliente.
    */
    public String getCurp() {
    return curp;
    }

    /**
    * Regresa el estado
    * @return Estado donde vive el cliente
    */
    public String getEstado() {
    return estado;
    }

    /**
    * Regresa el codigo postal
    * @return Código postal del cliente.
    */
    public String getCP() {
    return cp;
    }

    /**
    * Regresa la calle
    * @return Calle donde vive el cliente.
    */
    public String getCalle() {
    return calle;
    }


    /**
     * Getter del atributo calleNum
     * @return el valor del atributo calleBum
     */
    public int getCalleNum() {
        return calleNum;
    }

    /**
     * Setter del atributo calleNum
     * @param calleNum valora a asignar al atributo calleNum
     */
    public void setCalleNum(int calleNum) {
        this.calleNum = calleNum;
    }

    /**
    * Regresa el telefono
    * @return Teléfono del cliente.
    */
    public String getTelefono() {
    return telefono;
    }

    /**
    * Regresa la dirección de email
    * @return e-mail del cliente.
    */
    public String getEmail() {
    return email;
    }

    /**
    * Regresa la fecha de nacimiento
    * @return Fecha de nacimiento del cliente.
    */
    public String getFechaNacimiento() {
    return fechaNac;
    }

    /**
    * Regresa un string compuesto que representa la dirección completa
    * @return Dirección del cliente.
    */
    public String getDireccion() {
    return calle + ". Estado:" + estado + ". CP: " + cp;
    }

    /**
    * Asigna el nombre
    * @param nombre
    */
    public void setNombre(String nombre) {
    this.nombre = nombre;
    }

    /**
    * Asigna el apellido paterno
    * @param apellidoPaterno
    */
    public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    }

    /**
    * Asiga el apellido materno
    * @param apellidoMaterno
    */
    public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    }

    /**
    * Asigna el curp
    * @param curp
    */
    public void setCurp(String curp) {
    this.curp = curp;
    }

    /**
    * Asigna el estado
    * @param estado
    */
    public void setEstado(String estado) {
    this.estado = estado;
    }

    /**
    * Asigna el codigo postal
    * @param cp
    */
    public void setCP(String cp) {
    this.cp = cp;
    }

    /**
    * Asigna la calle
    * @param calle
    */
    public void setCalle(String calle) {
    this.calle = calle;
    }

    /**
    * Asigna el numero de telefono
    * @param telefono
    */
    public void setTelefono(String telefono) {
    this.telefono = telefono;
    }

    /**
    * Asigna el email
    * @param email
    */
    public void setEmail(String email) {
    this.email = email;
    }

    /**
    * Asigna la fecha de nacimiento
    * @param fechaNac
    */
    public void setFechaNacimiento(String fechaNac) {
    this.fechaNac = fechaNac;
    }

}
