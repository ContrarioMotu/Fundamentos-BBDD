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
    private static LinkedList<Mascota> mascotas = new LinkedList<Mascota>();
    private static LinkedList<Tarjeta> tarjetas = new LinkedList<Tarjeta>();

    /**
     * Método para cargar el archivo esteticas.csv, si no existe el archivo
     * se crea uno con el mismo nombre.
     */
    private static void cargarEsteticas() {
        try {
            File archivo = new File("esteticas.csv");

            if (!archivo.exists()) {
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
    private static void cargarClientes() {
        try {
            File archivo = new File("clientes.csv");

            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            BufferedReader input = new BufferedReader(new FileReader(archivo));

            String line;

            while ((line = input.readLine()) != null) {
                String[] l = line.split(",");

                clientes.add(new Cliente(l[0], l[1], l[2], l[3], l[4], l[5], Integer.parseInt(l[6]), l[7], l[8], l[9],
                        l[10]));
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
    private static void cargarMascotas() {
        try {
            File archivo = new File("mascotas.csv");

            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            BufferedReader input = new BufferedReader(new FileReader(archivo));

            String line;

            while ((line = input.readLine()) != null) {
                String[] l = line.split(",");

                mascotas.add(new Mascota(Integer.parseInt(l[0]), l[1], l[2], Integer.parseInt(l[3]),
                        Double.parseDouble(l[4]), l[5], l[6]));
            }

            input.close();

        } catch (Exception e) {
            System.err.println("Error al cargar el archivo de mascotas...");
            System.exit(1);
        }

    }

    /**
     * Método para cargar el archivo tarjetas.csv, si no existe el archivo
     * se crea uno con el mismo nombre.
     */
    private static void cargarTarjetas() {
        try {
            File archivo = new File("tarjetas.csv");

            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            BufferedReader input = new BufferedReader(new FileReader(archivo));

            String line;

            while ((line = input.readLine()) != null) {
                String[] l = line.split(",");

                tarjetas.add(new Tarjeta(Integer.parseInt(l[0]), l[1], l[2], l[3], l[4]));
            }

            input.close();

        } catch (Exception e) {
            System.err.println("Error al cargar el archivo de mascotas...");
            System.exit(1);
        }

    }

    /**
     * Método para guardar el archivo esteticas.csv, si no existe el archivo
     * se crea uno con el mismo nombre.
     */
    private static void guardarEsteticas() {
        try {

            File archivo = new File("esteticas.csv");

            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            BufferedWriter output = new BufferedWriter(new FileWriter(archivo));

            for (EsteticaVeterinaria e : esteticas) {
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
    private static void guardarClientes() {
        try {

            File archivo = new File("clientes.csv");

            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            BufferedWriter output = new BufferedWriter(new FileWriter(archivo));

            for (Cliente c : clientes) {
                output.write(
                        c.getCurp() + "," + c.getApellidoPaterno() + "," + c.getApellidoMaterno() + "," + c.getNombre()
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
    private static void guardarMascotas() {
        try {

            File archivo = new File("mascotas.csv");

            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            BufferedWriter output = new BufferedWriter(new FileWriter(archivo));

            for (Mascota m : mascotas) {
                output.write(m.getIdMascota() + "," + m.getNombreMascota() + "," + m.getCurpDueño() + "," + m.getEdad()
                        + "," + m.getPeso() + "," + m.getEspecie() + "," + m.getRaza() + "\n");
            }

            output.close();

        } catch (Exception e) {
            System.err.println("Error al guardar el archivo de mascotas...");
            System.exit(1);
        }
    }

    /**
     * Método para guardar el archivo tarjetas.csv, si no existe el archivo
     * se crea uno con el mismo nombre.
     */
    private static void guardarTarjetas() {
        try {

            File archivo = new File("tarjetas.csv");

            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            BufferedWriter output = new BufferedWriter(new FileWriter(archivo));

            for (Tarjeta t : tarjetas) {
                output.write(t.getIdTarjeta() + "," + t.getNumTarjeta() + "," + t.getVencimiento() + "," + t.getCvv()
                        + "," + t.getCurp() + "\n");
            }

            output.close();

        } catch (Exception e) {
            System.err.println("Error al guardar el archivo de mascotas...");
            System.exit(1);
        }
    }

    /**
     * Método que revisa si un {@link String} solo contiene letras y espacios.
     * 
     * @param cadena {@link String} a revisar.
     * @return {@code true} si la cadena solamente contiene letras y espacios,
     *         {@code false} en otro caso.
     */
    static boolean esCadenaSimple(String cadena) {

        if (cadena == null)
            return false;

        cadena = cadena.replaceAll(" ", "");

        return cadena.matches("[a-zA-Z]+");

    }

    /**
     * Método que revisa si un {@link String} solo contiene letras y números.
     * 
     * @param cadena {@Link String} a revisar.
     * @return {@code true} si la cadena solamente contiene letras y números,
     *         {@code false} en otro caso.
     */
    static boolean esAlfanumerico(String cadena, int tamano) {

        if (cadena == null)
            return false;

        return cadena.matches("[A-Z0-9]{" + tamano + "}");

    }

    // Revisa si un string solo contiene numeros
    /**
     * Método que revisa si un {@link String} solo contienenúmeros.
     * 
     * @param cadena {@link String} a revisar.
     * @return {@code true} si la cadena solamente contiene números,
     *         {@code false} en otro caso.
     */
    static boolean esNumerico(String cadena, int tamano) {

        if (cadena == null)
            return false;

        return cadena.matches("[0-9]{" + tamano + "}");

    }

    // Revisa si un string coincide con el formato de hora HH:MM
    /**
     * Método que revisa si un {@link String} coincide con el formato
     * de hora HH:MM.
     * 
     * @param hora {@link String} a revisar.
     * @return {@code true} si la cadena coincide con el formato,
     *         {@code false} en otro caso.
     */
    static boolean esHoraValida(String hora) {

        if (hora == null || hora.length() != 5 || !hora.contains(":"))
            return false;

        String[] array = hora.split(":");

        for (String i : array)
            if (i.length() != 2 || !esNumerico(i, 2))
                return false;

        int intVal1 = Integer.parseInt(array[0]);
        int intVal2 = Integer.parseInt(array[1]);

        return intVal1 >= 0 && intVal1 <= 24 && intVal2 >= 0 && intVal2 <= 59;

    }

    /**
     * Verifica si una cadena coincide con el formato de fecha DD/MM/AA
     * 
     * @param fecha la cadena a verificar
     * @return si la cadena cumple con el formato o no
     */
    static boolean esFechaValida(String fecha) {

        if (fecha == null || fecha.length() != 8 || !fecha.contains("/"))
            return false;

        String[] array = fecha.split("/");

        for (String i : array)
            if (i.length() != 2)
                return false;

        int intVal1 = Integer.parseInt(array[0]);
        int intVal2 = Integer.parseInt(array[1]);

        return intVal1 <= 32 && intVal1 >= 1 && intVal2 <= 12 && intVal2 >= 1;

    }

    /**
     * Verifica si una cadena coincide con el formato de fecha MM/AA
     * 
     * @param fecha la cadena a verificar
     * @return si la cadena cumple con el formato o no
     */
    static boolean verificarVencimiento(String fecha) {

        if (fecha == null || fecha.length() != 5 || !fecha.contains("/"))
            return false;

        String[] array = fecha.split("/");

        for (String i : array)
            if (i.length() != 2)
                return false;

        int intVal1 = Integer.parseInt(array[0]);

        return intVal1 <= 12 && intVal1 >= 1;

    }

    public static void main(String[] args) {

        int inputInt = 0;
        double inputDouble = 0;
        Scanner lector = new Scanner(System.in);

        String inputString;

        cargarEsteticas();
        cargarClientes();
        cargarMascotas();
        cargarTarjetas();

        // System.out.println(esAlfanumerico("3a1dfas31aaa",11));
        // System.out.println(esCadenaSimple("Cadena Simple"));

        while (inputInt != 4) {

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

                switch (inputInt) {

                    case 1:

                        while (true) {

                            System.out.println("\nIntroduce el nombre de la Estetica Veterinaria\n");
                            inputString = lector.nextLine();

                            if (esCadenaSimple(inputString))
                                break;

                            System.out.println("\nEntrada invalida, por favor ingrese un nombre solo con letras");

                        }

                        EsteticaVeterinaria nuevaVeterinaria = new EsteticaVeterinaria();
                        nuevaVeterinaria.setNombre(inputString);

                        while (true) {

                            System.out.println("\nIntroduce el numero de telefono de la nueva Estetica Veterinaria\n");
                            inputString = lector.nextLine();

                            if (esNumerico(inputString, 10))
                                break;

                            System.out.println("\nEntrada invalida, por favor ingrese un numero de diez digitos\n");

                        }

                        nuevaVeterinaria.setTelefono(inputString);

                        while (true) {

                            System.out.println("\nIntroduce la hora de apertura en el formato de 24 horas : HH:MM\n");
                            inputString = lector.nextLine();

                            if (esHoraValida(inputString))
                                break;

                            System.out.println(
                                    "\nEntrada invalida, por favor ingrese un horario en el formato de 24 horas : HH:MM\n");

                        }

                        nuevaVeterinaria.setHoraApertura(inputString);

                        while (true) {

                            System.out.println("\nIntroduce la hora de cierre en el formato de 24 horas : HH:MM\n");
                            inputString = lector.nextLine();

                            if (esHoraValida(inputString))
                                break;

                            System.out.println(
                                    "\nEntrada invalida, por favor ingrese un horario en el formato de 24 horas : HH:MM\n");

                        }

                        nuevaVeterinaria.setHoraCierre(inputString);

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

                        nuevaVeterinaria.setIngresos(inputDouble);

                        while (true) {

                            System.out.println("\nIngresa el numero de consultorios de la Estetica Veterinaria\n");

                            try {

                                inputInt = lector.nextInt();

                                if (inputInt < 1 || inputInt > 4)
                                    throw new InputMismatchException();

                                break;

                            } catch (InputMismatchException e) {

                                lector.nextLine();
                                System.out.println("Cantidad invalida, por favor ingrese un numero entre 1 y 4");

                            }

                        }

                        nuevaVeterinaria.setCantConsultorios(inputInt);

                        while (true) {

                            System.out.println("\nIntroduce el estado donde esta ubicada la Estetica Veterinaria\n");
                            inputString = lector.nextLine();

                            if (esCadenaSimple(inputString))
                                break;

                            System.out.println("Entrada invalida, ingresa una cadena con solo letras");

                        }

                        nuevaVeterinaria.setEstado(inputString);

                        while (true) {

                            System.out.println("\nIntroduce la calle donde esta ubicada la Estetica Veterinaria\n");
                            inputString = lector.nextLine();

                            if (esCadenaSimple(inputString))
                                break;

                            System.out.println("Entrada invalida, ingresa una cadena con solo letras");

                        }

                        nuevaVeterinaria.setCalle(inputString);

                        while (true) {

                            System.out.println("\nIntroduce el numero de donde esta ubicada la Estetica Veterinaria\n");

                            try {

                                inputInt = lector.nextInt();

                                if (inputInt < 1)
                                    throw new InputMismatchException();

                                break;

                            } catch (InputMismatchException e) {

                                lector.nextLine();
                                System.out.println("Numero invalido, introduce un numero entero positivo");

                            }

                        }

                        nuevaVeterinaria.setNumero(inputInt);

                        while (true) {

                            System.out.println(
                                    "\nIntroduce el codigo postal de donde esta ubicada la Estetica Veterinaria\n");
                            inputString = lector.nextLine();

                            if (esNumerico(inputString, 5))
                                break;

                            System.out.println("Entrada invalida, ingresa un numero de cinco cifras");

                        }

                        nuevaVeterinaria.setCp(inputString);

                        esteticas.add(nuevaVeterinaria);

                        break;

                    case 2:

                        while (true) {

                            System.out.println("\nIntroduce el nombre(s) del cliente\n");
                            inputString = lector.nextLine();

                            if (esCadenaSimple(inputString))
                                break;

                            System.out.println("Ingresa una cadena solo con letras y espacios");

                        }

                        Cliente nuevoCliente = new Cliente();
                        nuevoCliente.setNombre(inputString);

                        while (true) {

                            System.out.println("\nIntroduce el apellido paterno del cliente\n");
                            inputString = lector.nextLine();

                            if (esCadenaSimple(inputString))
                                break;

                            System.out.println("Ingresa una cadena solo con letras y espacios");

                        }

                        nuevoCliente.setApellidoPaterno(inputString);

                        while (true) {

                            System.out.println("\nIntroduce el apellido materno del cliente\n");
                            inputString = lector.nextLine();

                            if (esCadenaSimple(inputString))
                                break;

                            System.out.println("Ingresa una cadena solo con letras y espacios");

                        }

                        nuevoCliente.setApellidoMaterno(inputString);

                        while (true) {

                            System.out.println("\nIntroduce el CURP del cliente\n");
                            inputString = lector.nextLine();

                            if (esAlfanumerico(inputString.toUpperCase(), 18))
                                break;

                            System.out.println("Ingresa una cadena solo con letras y espacios");

                        }

                        nuevoCliente.setCurp(inputString.toUpperCase());

                        while (true) {

                            System.out.println("\nIntroduce el estado donde vive el cliente\n");
                            inputString = lector.nextLine();

                            if (esCadenaSimple(inputString))
                                break;

                            System.out.println("Ingresa una cadena solo con letras y espacios");

                        }

                        nuevoCliente.setEstado(inputString);

                        while (true) {

                            System.out.println("\nIntroduce la calle donde vive el cliente\n");
                            inputString = lector.nextLine();

                            if (esCadenaSimple(inputString))
                                break;

                            System.out.println("Ingresa una cadena solo con letras y espacios");

                        }

                        nuevoCliente.setEstado(inputString);

                        while (true) {

                            System.out.println("\nIntroduce el numero donde vive el cliente\n");

                            try {

                                inputInt = lector.nextInt();

                                if (inputInt < 1)
                                    throw new InputMismatchException();

                                break;

                            } catch (InputMismatchException e) {

                                lector.nextLine();
                                System.out.println("Numero invalido, introduce un numero entero positivo");

                            }

                        }

                        nuevoCliente.setCalleNum(inputInt);

                        while (true) {

                            System.out.println("\nIntroduce el CP de donde vive el cliente\n");
                            inputString = lector.nextLine();

                            if (esNumerico(inputString, 5))
                                break;

                            System.out.println("Ingresa 5 numeros enteros");

                        }

                        nuevoCliente.setCP(inputString);

                        do {

                            System.out.println("\n¿Desea asociar un email con el cliente?\n" +
                                    "\n" +
                                    "si\n" +
                                    "no\n");

                            inputString = lector.nextLine();

                            switch (inputString) {

                                case "si":

                                    System.out.println("\nIntroduzca el email\n");
                                    inputString = lector.nextLine();

                                    // Futura verificacion de email aqui

                                    nuevoCliente.setEmail(inputString);

                                    inputInt = 1;
                                    break;

                                case "no":
                                    inputInt = 1;
                                    break;

                                default:
                                    System.out.println("\nRespuesta invalida, vuelva a intentarlo\n");
                                    break;

                            }

                        } while (inputInt != 1);

                        inputInt = 0;

                        while (true) {

                            System.out.println("\nIntroduce el telefono del cliente\n");
                            inputString = lector.nextLine();

                            if (esNumerico(inputString, 10))
                                break;

                            System.out.println("Ingresa 10 digitos");

                        }

                        nuevoCliente.setTelefono(inputString);

                        while (true) {

                            System.out.println(
                                    "\nIntroduzca la fecha de nacimiento del cliente en el formato DD/MM/AA\n");
                            inputString = lector.nextLine();

                            if (esHoraValida(inputString))
                                break;

                            System.out.println("\nFecha invalida, ingrese una fecha en el formato DD/MM/AA\n");

                        }

                        nuevoCliente.setFechaNacimiento(inputString);

                        do {

                            System.out.println("\n¿Desea asociar una tarjeta con el cliente?\n" +
                                    "\n" +
                                    "si\n" +
                                    "no\n");

                            inputString = lector.nextLine();

                            switch (inputString) {

                                case "si":

                                    while (true) {

                                        System.out.println("\nIntroduce el numero de la tarjeta del cliente\n");
                                        inputString = lector.nextLine();

                                        if (esNumerico(inputString, 16))
                                            break;

                                        System.out.println("\nNumero de tarjeta invalido, Ingresa 16 digitos\n");

                                    }

                                    Tarjeta nuevaTarjeta = new Tarjeta();
                                    nuevaTarjeta.setNumTarjeta(inputString);

                                    while (true) {

                                        System.out.println(
                                                "\nIntroduce la fecha de vencimiento la tarjeta del cliente en formato MM/AA\n");
                                        inputString = lector.nextLine();

                                        if (verificarVencimiento(inputString))
                                            break;

                                        System.out.println("\nFecha invalida, ingresa un fecha en formato MM/AA\n");

                                    }

                                    nuevaTarjeta.setVencimiento(inputString);

                                    while (true) {

                                        System.out.println("\nIntroduce el CVV de la tarjeta del cliente\n");
                                        inputString = lector.nextLine();

                                        if (esNumerico(inputString, 3))
                                            break;

                                        System.out.println("CVV, Ingresa 3 digitos");

                                    }

                                    nuevaTarjeta.setCvv(inputString);
                                    tarjetas.add(nuevaTarjeta);

                                    inputInt = 1;
                                    break;

                                case "no":
                                    inputInt = 1;
                                    break;

                                default:
                                    System.out.println("\nRespuesta invalida, vuelva a intentarlo\n");
                                    break;

                            }

                        } while (inputInt != 1);

                        clientes.add(nuevoCliente);

                        break;

                    case 3:

                        while (true) {

                            System.out.println("\nIntroduce el nombre de la mascota\n");
                            inputString = lector.nextLine();

                            if (esCadenaSimple(inputString))
                                break;

                            System.out.println("\nEntrada invalida, por favor ingrese un nombre solo con letras");

                        }

                        String nombre = inputString;

                        while (true) {

                            System.out.println("\nIntroduce el CURP del cliente\n");
                            inputString = lector.nextLine();

                            if (esAlfanumerico(inputString.toUpperCase(), 18))
                                break;

                            System.out.println("Ingresa una cadena solo con letras y espacios");

                        }

                        String curp = inputString;

                        while (true) {

                            System.out.println("\nIntroduce la edad de la mascota.\n");
                            inputString = lector.nextLine();

                            if (esNumerico(inputString, 2))
                                break;

                            System.out.println("\nEntrada invalida, por favor ingrese un numero de dos digitos\n");

                        }

                        int edad = Integer.parseInt(inputString);

                        while (true) {

                            System.out.println("\nIntroduce el peso de la mascota.\n");

                            inputString = lector.nextLine();

                            try {

                                inputDouble = Double.parseDouble(inputString);
                                break;

                            } catch (NumberFormatException e) {

                                System.out.println("Entrada invalida, por favor ingrese un double.\n");

                            }

                        }

                        double peso = inputDouble;

                        while (true) {

                            System.out.println("\nIntroduce la especie de la mascota.\n");
                            inputString = lector.nextLine();

                            if (esCadenaSimple(inputString))
                                break;

                            System.out.println("\nEntrada invalida, por favor ingrese una especie solo con letras");

                        }

                        String especie = inputString;

                        while (true) {

                            System.out.println("\nIntroduce la raza de la mascota.\n");
                            inputString = lector.nextLine();

                            if (esCadenaSimple(inputString))
                                break;

                            System.out.println("\nEntrada invalida, por favor ingrese una raza solo con letras");

                        }

                        String raza = inputString;

                        Mascota nuevaMascota = new Mascota(1, nombre, curp, edad, peso, especie, raza);
                        mascotas.add(nuevaMascota);

                        break;

                    case 4:

                        guardarEsteticas();
                        guardarClientes();
                        guardarMascotas();
                        guardarTarjetas();

                        System.exit(0);

                        break;

                    default:
                        throw new InputMismatchException();

                }

            } catch (InputMismatchException e) {

                System.out.println("Opcion invalida, ingresa un número como opción");
                lector.nextLine();

            }

        }

    }

}
