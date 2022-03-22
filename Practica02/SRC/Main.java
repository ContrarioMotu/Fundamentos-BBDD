import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    //Revisa si un string solo contiene letras y espacios
    static boolean esCadenaSimple(String cadena){

        if(cadena == null)
            return false;

        cadena = cadena.replaceAll(" ","");

        return cadena.matches("[a-zA-Z]+");

    }

    //Revisa si un string solo contiene letras y numeros
    static boolean esAlfanumerico(String cadena, int tamaño){

        if(cadena == null)
            return false;

        return cadena.matches("[A-Z0-9]{" + tamaño + "}");

    }

    //Revisa si un string solo contiene numeros
    static boolean esNumerico(String cadena, int tamaño){

        if(cadena == null)
            return false;

        return cadena.matches("[0-9]{" + tamaño + "}");

    }

    //Revisa si un string coincide con el formato de hora HH:MM
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

                        //Aqui es va la parte de guardar el objeto en un archivo CSV

                        break;

                    case 2 :
                        break;

                    case 3 :
                        break;

                    case 4 :
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
