
public class Persona {

    //Atributos de la clase
    private String Nombre;
    private String Apellido;
    private int Edad;
    private int Cédula;

    /* Constructor sin parametros
    public Persona() {
        this.Nombre = "Juan";
        this.Apellido = "Perez";
        this.Edad = 30;
        this.Cédula = 1234567;

    }*/
//Constructor con parametros
    public Persona(String Nombre, String Apellido, int Edad, int Cédula) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Cédula = Cédula;

    }

//Métodos
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getCédula() {
        return Cédula;
    }

    public void setCédula(int Cédula) {
        this.Cédula = Cédula;
    }

    public void mostrarP() {
        System.out.println("El Nombre es: " + Nombre);
        System.out.println("El Apellido es: " + Apellido);
        System.out.println("La Edad es: " + Edad);
        System.out.println("La Cédula es: " + Cédula);
    }
}
