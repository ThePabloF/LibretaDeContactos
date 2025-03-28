package ec.edu.ec.ups.poo.ec.ups.clases;

public class Persona {
    // Un objeto es todo lo que tenga atributos y metodos
    // Los atributos de normal no deben estar inicializados
    // Los atributos son caracteristicas de un objeto
    // Los métodos son acciones del objeto


    // Una clase es un conjunto de OBJETOS con Metodos similares
    // Las clases siempre van con mayuscula y en singular
    // De una clase salen los objetos
    // Instanciar un objeto: Nombre de la clase  Nombre del objeto = new Constructor();


// Atributos de mi clase

    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;

    public Persona(String cedula, String nombre, String apellido, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public Persona() {

    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cedula: " + cedula +
                " ,Nombre: " + nombre +
                " ,Apellido: " + apellido +
                " ,Direccion: " + direccion;
    }


}
