package ec.edu.ec.ups.poo.ups.poo.main;

import ec.edu.ec.ups.poo.ec.ups.clases.Familiar;
import ec.edu.ec.ups.poo.ec.ups.clases.Operacion;
import ec.edu.ec.ups.poo.ec.ups.clases.Persona;



import java.util.GregorianCalendar;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operacion operacion = new Operacion();

        GregorianCalendar gregorianCalendar = new GregorianCalendar();

//        //Establecemos los valores de los atributos de la clase Padre
//        familiar.setCedula("0107272437");
//        familiar.setNombre("Pablo");
//        familiar.setApellido("Feijo");
//        familiar.setDireccion("Jorge Icaza");
//        //Establecemos los valores de los atributos de la clase Hija
//        familiar.setParentesco("Familiar Parentesco 1");
//        familiar.setTipoDeSangre("Tipo de Sangre 1");
//        System.out.println(personaN);


        System.out.println("Cuantas personas desea ingresar:");
        int numPersonas = sc.nextInt();
        Persona[] persona = new Persona[numPersonas];
        System.out.println("Cuantos Familiares desea ingresar:");
        int numFamiliar = sc.nextInt();
        Familiar[] familia = new Familiar[numFamiliar];



        for (int i = 0; i < numPersonas; i++) {
            System.out.println("Persona " + (i+1) + ":");

            System.out.println("Ingrese el numero de cedula: ");
            String cedula = sc.next();
            System.out.println("Ingrese el nombre: ");
            String nombre = sc.next();
            System.out.println("Ingrese el apellido: ");
            String apellido = sc.next();
            System.out.println("Ingrese la direccion: ");
            String direccion = sc.nextLine();

            Persona persona1 = new Persona(cedula, nombre, apellido, direccion);
            persona[i] = persona1;

        }

        for (int i = 0; i < numFamiliar; i++) {



            System.out.println("Familiar " + (i+1) + ":");

            System.out.println("Ingrese el numero de cedula: ");
            String cedula = sc.next();
            System.out.println("Ingrese el nombre: ");
            String nombre = sc.next();
            System.out.println("Ingrese el apellido: ");
            String apellido = sc.next();
            System.out.println("Ingrese la direccion: ");
            String direccion = sc.next();
            System.out.println("Ingrese el parentesco: ");
            String parentesco = sc.next();
            System.out.println("Ingrese el tipo de sangre: ");
            String tipoSangre = sc.next();
            System.out.println("Ingrese el año de nacimiento: ");
            int anio = sc.nextInt();
            System.out.println("Ingrese el mes de nacimiento entre 1 y 12: ");
            int mes = sc.nextInt();
            System.out.println("Ingrese el dia de nacimiento: ");
            int dia = sc.nextInt();


            GregorianCalendar calendar = new GregorianCalendar(anio, mes, dia);
            Familiar familiar1 = new Familiar(cedula, nombre, apellido, direccion,parentesco,tipoSangre,calendar);
            familia[i] = familiar1;
        }


        System.out.println("IMPRIMIENDO PERSONAS:");
        for (int i = 0; i < numPersonas; i++) {
            System.out.println("Persona " + (i+1) + ":");
            System.out.println(persona[i].toString());


        }
        System.out.println("IMPRIMIENDO FAMILIAR:");
        for (int i = 0; i < numFamiliar; i++) {
            System.out.println("Familiar " + (i+1) + ": ");
            System.out.println(familia[i].toString());

        }




//        System.out.println("Ingrese el numero 1: ");
//        int n1 = sc.nextInt();
//        System.out.println("Ingrese el numero 2: ");
//        int n2 = sc.nextInt();
//
//        operacion.sumar(n1, n2);// se envian parametros a los metodos
//        operacion.resta(n1, n2);
//        operacion.multiplicacion(n1, n2);
//        operacion.division(n1, n2);
//        operacion.mostrarDatos();

//        Persona persona = new Persona();
//        persona.setCedula("0123456789");
//        String cedu;
//        cedu = persona.getCedula();
//        System.out.println(cedu);



    }
}
