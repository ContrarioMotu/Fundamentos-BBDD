import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static LinkedList<EsteticaVeterinaria> esteticas = new LinkedList<EsteticaVeterinaria>();
    private static LinkedList<Cliente> clientes = new LinkedList<Cliente>();
    //private static LinkedList<Mascota> mascotas = new LinkedList<Mascota>();

    /**
     * Método para cargar el archivo esteticas.csv, si no existe el archivo
     * se crea uno con el mismo nombre.
     */
    private static void cargarEsteticas(){
        try {
            File archivo = new File("esteticas.csv");

            if(!archivo.exists()){
                archivo.createNewFile();
            }

            BufferedReader input = new BufferedReader(new FileReader(archivo));

            String line;

            while ((line = input.readLine()) != null) {
                String[] l = line.split(",");

                esteticas.add(new EsteticaVeterinaria(Integer.parseInt(l[0]), l[1], l[2], l[3], l[4],
                                                      Double.parseDouble(l[5]), Integer.parseInt(l[6]),
                                                      l[7], l[8], Integer.parseInt(l[9]), l[10]));
            }
            
            input.close();
            
        } catch (Exception e) {
            System.err.println("Error al cargar el archivo de estéticas...");
            System.exit(1);
        }

    }

    /**
     * Método para cargar el archivo clientes.csv, si no existe el archivo
     * se crea uno con el mismo nombre.
     */
    private static void cargarClientes(){
        try {
            File archivo = new File("clientes.csv");

            if(!archivo.exists()){
                archivo.createNewFile();
            }

            BufferedReader input = new BufferedReader(new FileReader(archivo));

            String line;

            while ((line = input.readLine()) != null) {
                String[] l = line.split(",");

                clientes.add(new Cliente(l[0], l[1], l[2], l[3], l[4], l[5], l[6], l[7], l[8], l[9]));
            }
            
            input.close();
            
        } catch (Exception e) {
            System.err.println("Error al cargar el archivo de clientes...");
            System.exit(1);
        }

    }

    /**
     * Método para cargar el archivo mascotas.csv, si no existe el archivo
     * se crea uno con el mismo nombre.
     */
    //private static void cargarMascotas(){
    //    try {
    //        File archivo = new File("mascotas.csv");
    //
    //        if(!archivo.exists()){
    //            archivo.createNewFile();
    //        }
    //
    //        BufferedReader input = new BufferedReader(new FileReader(archivo));
    //
    //        String line;
    //
    //        while ((line = input.readLine()) != null) {
    //            String[] l = line.split(",");
    //
    //            mascotas.add();
    //        }
    //        
    //        input.close();
    //        
    //    } catch (Exception e) {
    //        System.err.println("Error al cargar el archivo de mascotas...");
    //        System.exit(1);
    //    }
    //
    //}

    /**
     * Método para guardar el archivo esteticas.csv, si no existe el archivo
     * se crea uno con el mismo nombre.
     */
    private static void guardarEsteticas(){
        try {
            
            File archivo = new File("esteticas.csv");
    
            if(!archivo.exists()){
                archivo.createNewFile();
            }

            BufferedWriter output = new BufferedWriter(new FileWriter(archivo));

            for(EsteticaVeterinaria e : esteticas){
                output.write(e.getId() + "," + e.getNombre() + "," + e.getTelefono() + "," + e.getHoraApertura()
                             + "," + e.getHoraCierre() + "," + e.getIngresos() + "," + e.getCantConsultorios()
                             + "," + e.getEstado() + "," + e.getCalle() + "," + e.getNumero() + "," + e.getCp() + "\n");
            }

            output.close();

        } catch (Exception e) {
            System.err.println("Error al guardar el archivo de estéticas...");
            System.exit(1);
        }
    }

    /**
     * Método para guardar el archivo clientes.csv, si no existe el archivo
     * se crea uno con el mismo nombre.
     */
    private static void guardarClientes(){
        try {
            
            File archivo = new File("clientes.csv");
    
            if(!archivo.exists()){
                archivo.createNewFile();
            }

            BufferedWriter output = new BufferedWriter(new FileWriter(archivo));

            for(Cliente c : clientes){
                output.write(c.getCurp() + "," + c.getApellidoPaterno() + "," + c.apellidoMaterno + "," + c.getNombre()
                             + "," + c.getEstado() + "," + c.getCalle() + "," + c.getCP() + "," + c.getEmail()
                             + "," + c.getTelefono() + "," + c.getFechaNacimiento() + "\n");
            }

            output.close();
        } catch (Exception e) {
            System.err.println("Error al guardar el archivo de clientes...");
            System.exit(1);
        }
    }

    /**
     * Método para guardar el archivo mascotas.csv, si no existe el archivo
     * se crea uno con el mismo nombre.
     */
    //private static void guardarMascotas(){
    //    try {
    //        
    //        File archivo = new File("mascotas.csv");
    //
    //        if(!archivo.exists()){
    //            archivo.createNewFile();
    //        }
    //
    //        BufferedWriter output = new BufferedWriter(new FileWriter(archivo));
    //
    //        for(Mascota m : mascotas){
    //            output.write();
    //        }
    //    } catch (Exception e) {
    //        System.err.println("Error al guardar el archivo de mascotas...");
    //        System.exit(1);
    //    }
    //}

    /**
     * Método que revisa si un <i>String</i> solo contiene letras y espacios.
     * @param cadena <i>String</i> a revisar.
     * @return <i>true</i> si la cadena solamente contiene letras y espacios,
     * <i>false</i> en otro caso.
     */
    static boolean esCadenaSimple(String cadena){

        if(cadena == null)
            return false;

        cadena = cadena.replaceAll(" ","");

        return cadena.matches("[a-zA-Z]+");

    }

    /**
     * Método que revisa si un <i>String</i> solo contiene letras y números.
     * @param cadena <i>String</i> a revisar.
     * @return <i>true</i> si la cadena solamente contiene letras y números,
     * <i>false</i> en otro caso.
     */
    static boolean esAlfanumerico(String cadena, int tamano){

        if(cadena == null)
            return false;

        return cadena.matches("[A-Z0-9]{" + tamano + "}");

    }

    //Revisa si un string solo contiene numeros
    /**
     * Método que revisa si un {@link String} solo contienenúmeros.
     * @param cadena {@link String} a revisar.
     * @return {@code true} si la cadena solamente contiene números,
     * {@code false} en otro caso.
     */
    static boolean esNumerico(String cadena, int tamano){

        if(cadena == null)
            return false;

        return cadena.matches("[0-9]{" + tamano + "}");

    }

    //Revisa si un string coincide con el formato de hora HH:MM
    /**
     * Método que revisa si un {@link String} coincide con el formato
     * de hora HH:MM.
     * @param hora {@link String} a revisar.
     * @return {@code true} si la cadena coincide con el formato,
     * {@code false} en otro caso.
     */
    static boolean esHoraValida(String hora){
        
        if(hora == null || hora.length() != 5)
            return false;

        if(!hora.contains(":"))
            return false;

        String[] array = hora.split(":");

        for (String i: array)
            if (i.length() != 2 || !esNumerico(i,2))
                return false;

        int intVal1 = Integer.parseInt(array[0]);
        int intVal2 = Integer.parseInt(array[1]);

        return intVal1 >= 0 && intVal1 <= 24 && intVal2 >= 0 && intVal2 <= 59;

    }

    public static void main(String[] args) {

        int inputInt = 0;
        double inputDouble = 0;
        Scanner lector = new Scanner(System.in);

        String inputString;

        cargarEsteticas();
        cargarClientes();
        //cargaMascotas();

        //System.out.println(esAlfanumerico("3a1dfas31aaa",11));
        //System.out.println(esCadenaSimple("Cadena Simple"));

        while(inputInt != 4){

            System.out.println("Beinvenido al registro de Esteticas Veterinarias Little Friend\n" +
                    "\n" +
                    "Eliga una accion a realizar\n" +
                    "\n" +
                    "1.Registrar nueva veterinaria\n" +
                    "2.Registrar nuevo cliente\n" +
                    "3.Registrar nueva mascota\n" +
                    "4.Salir\n");

            try {

                inputInt = lector.nextInt();
                lector.nextLine();

                switch(inputInt){

                    case 1 :

                        while (true) {

                            System.out.println("\nIntroduce el nombre de la Estetica Veterinaria\n");
                            inputString = lector.nextLine();

                            if (esCadenaSimple(inputString))
                                break;

                            System.out.println("\nEntrada invalida, por favor ingrese un nombre solo con letras");

                        }

                        EsteticaVeterinaria nuevo = new EsteticaVeterinaria();
                        nuevo.setNombre(inputString);

                        while (true) {

                            System.out.println("\nIntroduce el numero de telefono de la nueva Estetica Veterinaria\n");
                            inputString = lector.nextLine();

                            if (esNumerico(inputString, 10))
                                break;

                            System.out.println("\nEntrada invalida, por favor ingrese un numero de diez digitos\n");

                        }

                        nuevo.setTelefono(inputString);

                        while (true) {

                            System.out.println("\nIntroduce la hora de apertura en el formato de 24 horas : HH:MM\n");
                            inputString = lector.nextLine();

                            if (esHoraValida(inputString))
                                break;

                            System.out.println("\nEntrada invalida, por favor ingrese un horario en el formato de 24 horas : HH:MM\n");

                        }

                        nuevo.setHoraApertura(inputString);

                        while (true) {

                            System.out.println("\nIntroduce la hora de cierre en el formato de 24 horas : HH:MM\n");
                            inputString = lector.nextLine();

                            if (esHoraValida(inputString))
                                break;

                            System.out.println("\nEntrada invalida, por favor ingrese un horario en el formato de 24 horas : HH:MM\n");

                        }

                        nuevo.setHoraCierre(inputString);

                        while (inputDouble == 0) {

                            System.out.println("\nIntroduce los ingresos de la Estetica Veterinaria");

                            try {
                                inputDouble = lector.nextDouble();
                            } catch (InputMismatchException e) {

                                lector.nextLine();
                                System.out.println("\nMonto invalido");
                                inputDouble = 0;

                            }

                        }

                        nuevo.setIngresos(inputDouble);

                        while (true){

                            System.out.println("\nIngresa el numero de consultorios de la Estetica Veterinaria\n");

                            try {

                                inputInt = lector.nextInt();

                                if (inputInt < 1 || inputInt > 4)
                                    throw new InputMismatchException();

                                break;

                            } catch (InputMismatchException e){

                                lector.nextLine();
                                System.out.println("Cantidad invalida, por favor ingrese un numero entre 1 y 4");

                            }

                        }

                        nuevo.setCantConsultorios(inputInt);

                        while (true) {

                            System.out.println("\nIntroduce el estado donde esta ubicada la Estetica Veterinaria\n");
                            inputString = lector.nextLine();

                            if (esCadenaSimple(inputString))
                                break;

                            System.out.println("Entrada invalida, ingresa una cadena con solo letras");

                        }

                        nuevo.setEstado(inputString);

                        while (true) {

                            System.out.println("\nIntroduce la calle donde esta ubicada la Estetica Veterinaria\n");
                            inputString = lector.nextLine();

                            if (esCadenaSimple(inputString))
                                break;

                            System.out.println("Entrada invalida, ingresa una cadena con solo letras");

                        }

                        nuevo.setCalle(inputString);

                        while (true) {

                            System.out.println("\nIntroduce el numero de donde esta ubicada la Estetica Veterinaria\n");

                            try {

                                inputInt = lector.nextInt();

                                if(inputInt < 1)
                                    throw new InputMismatchException();

                                break;

                            } catch (InputMismatchException e) {

                                lector.nextLine();
                                System.out.println("Numero invalido, introduce un numero entero positivo");

                            }

                        }

                        nuevo.setNumero(inputInt);

                        while (true) {

                            System.out.println("\nIntroduce el codigo postal de donde esta ubicada la Estetica Veterinaria\n");
                            inputString = lector.nextLine();

                            if (esNumerico(inputString,5))
                                break;

                            System.out.println("Entrada invalida, ingresa un numero de cinco cifras");

                        }

                        nuevo.setCp(inputString);

                        esteticas.add(nuevo);

                        break;

                    case 2 :

                        //Para añadir el nuevo cliente al archivo.
                        //clientes.add(nuevo);
                        break;

                    case 3 :

                        //Para añadir la nueva mascota al archivo.
                        //mascotas.add(nuevo);
                        break;

                    case 4 :

                        guardarEsteticas();
                        guardarClientes();
                        //guardaMascotas();
                        System.exit(0);
                        break;

                    default: throw new InputMismatchException();

                }

            } catch (InputMismatchException e) {

                System.out.println("Opcion invalida, ingresa un número como opción");
                lector.nextLine();

            }

        }

    }

}
