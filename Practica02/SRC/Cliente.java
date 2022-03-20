public class Cliente {

  String curp;
  String apellidoPaterno;
  String apellidoMaterno;
  String nombre;
  String estado;
  String calle;
  String cp;
  String email;
  String telefono;
  String fechaNac;

  public Cliente(String curp, String apellidoPaterno, String apellidoMaterno, String nombre,
    String estado, String calle, String cp, String email, String telefono, String fechaNac) {
    this.curp = curp;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
    this.nombre = nombre;
    this.estado = estado;
    this.calle = calle;
    this.cp = cp;
    this.email = email;
    this.telefono = telefono;
    this.fechaNac = fechaNac;
  }

  /**
   * Regresa el nombre
   * @return
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Regresa el apellido paterno
   * @return
   */
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  /**
   * Regresa el apellido materno
   * @return
   */
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  /**
   * Regresa el CURP
   * @return
   */
  public String getCurp() {
    return curp;
  }

  /**
   * Regresa el estado
   * @return
   */
  public String getEstado() {
    return estado;
  }

  /**
   * Regresa el codigo postal
   * @return
   */
  public String getCP() {
    return cp;
  }

  /**
   * Regresa la calle
   * @return
   */
  public String getCalle() {
    return calle;
  }

  /**
   * Regresa el telefono
   * @return
   */
  public String getTelefono() {
    return telefono;
  }

  /**
   * Regresa la dirección de email
   * @return
   */
  public String getEmail() {
    return email;
  }

  /**
   * Regresa la fecha de nacimiento
   * @return
   */
  public String getFechaNacimiento() {
    return fechaNac;
  }

  /**
   * Regresa un string compuesto que representa la dirección completa
   * @return
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
