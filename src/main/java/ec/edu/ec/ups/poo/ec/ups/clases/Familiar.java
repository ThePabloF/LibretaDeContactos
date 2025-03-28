package ec.edu.ec.ups.poo.ec.ups.clases;

import java.util.GregorianCalendar;


public class Familiar extends Persona {

    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaNacimiento;



    public Familiar(String cedula, String nombre, String apellido, String direccion,String parentesco, String tipoDeSangre,GregorianCalendar fechaNacimiento) {
        super(cedula, nombre, apellido, direccion);
        this.parentesco = cedula;
        this.tipoDeSangre = nombre;
        this.fechaNacimiento = fechaNacimiento;

    }
    public Familiar(){

    }


    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public double calcularSEdad() {
        GregorianCalendar actual = new GregorianCalendar();
        int diaA = actual.get(GregorianCalendar.DAY_OF_MONTH);
        int diaN = fechaNacimiento.get(GregorianCalendar.DAY_OF_MONTH);
        int mesA = actual.get(GregorianCalendar.MONTH);
        int mesN = fechaNacimiento.get(GregorianCalendar.MONTH);
        int anioA = actual.get(GregorianCalendar.YEAR);
        int anioN = fechaNacimiento.get(GregorianCalendar.YEAR);

        int edad = anioA - anioN ;

        if ((mesA == mesN && diaA >= diaN) || mesA > mesN ) {
            return edad;
        } else {
            return edad -1;
        }

    }


    @Override
    public String toString() {
        return super.toString() +
                ", Parentesco: "+parentesco+
                ", Tipo de Sangre :"+ tipoDeSangre+
                ", Edad: "+ calcularSEdad()+".";


    }
}
