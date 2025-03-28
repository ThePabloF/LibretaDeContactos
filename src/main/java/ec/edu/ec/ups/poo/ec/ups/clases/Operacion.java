package ec.edu.ec.ups.poo.ec.ups.clases;

import java.util.Scanner;
// CONSTRUCTOR: Es un metodo especial de una clase que se invoca siempre que se crea un objeto de esa clase
// Tienen el mismo nombre que la clase
// No devuelve ningun valor
// Debe declararse como publico


//OBJETO:
// Cosas que suceden cuando se crea:

// Se asigna memoria para el objeto
// Se inicializan los atributos de ese objeto
// Se invoca al construtor de la clase  que puede ser uno entre varios

public class Operacion {
    Scanner sc = new Scanner(System.in);
    // ATRIBUTOS


    int suma;
    int resta;
    int multiplicacion;
    int division;

    //METODOS

    //Metodo para pedirle al usuario que digite 2 numeros

    public void sumar(int num1, int num2) { // En los parentesis "()"  Se ingresan parametros
        suma = num1 + num2;
    }

    public void resta(int num1, int num2) {
        resta = num1 - num2;
    }
    public void multiplicacion(int num1, int num2) {
        multiplicacion = num1 * num2;
    }
    public void division(int num1, int num2) {
        division = num1 / num2;
    }

    public void mostrarDatos() {
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La multiplicacion de los numeros es: " + multiplicacion);
        System.out.println("La division de los numeros es: " + division);

    }
}
