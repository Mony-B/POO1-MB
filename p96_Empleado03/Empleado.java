package p96_Empleado03;

public class Empleado {
    //Propieddes
    private String Nombre;
    private int Edad;
   

    //Constructor
    public Empleado() {};
    public Empleado(String nombre, int edad) {
        Nombre = nombre;
        Edad = edad;
    }

    //Métodos
     public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    @Override
    public String toString() {
        return "Empleado [Nombre=" + Nombre + ", Edad=" + Edad + "]";
    }
    

}
