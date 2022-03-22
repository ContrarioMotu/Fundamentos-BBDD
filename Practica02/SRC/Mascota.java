public class Mascota {
    
    private int idMascota;
    private String nombreMascota;
    private String curpDueño;
    private int edad;
    private double peso;
    private String especie;
    private String raza;

    /**
     * Construye una mascota.
     * @param idMascota el identificador de la mascota.
     * @param nombreMascota el nombre de la mascota.
     * @param curpDueño el CURP del dueño.
     * @param edad la edad de la mascota.
     * @param especie la especie de la mascota.
     * @param raza la raza de la mascota.
     */
    public Mascota(int idMascota, String nombreMascota, String curpDueño, int edad,
           double peso, String especie, String raza) {
    this.idMascota = idMascota;
    this.nombreMascota = nombreMascota;
    this.curpDueño = curpDueño;
    this.edad = edad;
    this.peso = peso;
    this.especie = especie;
    this.raza = raza;
    }

    /**
     * Regresa el id de la mascota.
     * @return el id de la mascota. 
     */
    public int getIdMascota() {
        return idMascota;
    }

    /**
     * Regresa el nombre de la mascota.
     * @return el nombre de la mascota. 
     */    
    public String getNombreMascota() {
        return nombreMascota;
    }
    
    /**
     * Regresa el curp del dueño de la mascota.
     * @return el curp del dueño de la mascota. 
     */
    public String getCurpDueño() {
        return curpDueño;
    }
    
    /**
     * Regresa la edad de la mascota.
     * @return la edad de la mascota. 
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Regresa el peso de la mascota.
     * @return el peso de la mascota. 
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Regresa la especie de la mascota.
     * @return la especie de la mascota. 
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Regresa la raza de la mascota.
     * @return la raza de la mascota. 
     */
    public String getRaza() {
        return raza;
    }
    
    /**
     * Define el id de la mascota
     * @param idMascota el id de la mascota.
     */
    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    /**
     * Define el nombre de la mascota.
     * @param nombreMascota el nombre de la mascota.
     */
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    /**
     * Define el curp del dueño de la mascota.
     * @param curpDueño el curp del dueño de la mascota.
     */
    public void setCurpDueño(String curpDueño) {
        this.curpDueño = curpDueño;
    }

    /**
     * Define la edad de la mascota.
     * @param edad la edad de la mascota.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Define el peso de la mascota.
     * @param peso el peso de la mascota.
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Define la especie de la mascota.
     * @param especie la especie de la mascota.
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Define la raza de la mascota.
     * @param raza la raza de la mascota.
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

}
