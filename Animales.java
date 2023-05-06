
public class Animales {

//Atributos de la clase
    private String Nombre;
    private String Género;
    private String Raza;

    /* Constructor sin parametros
    public Animales() {
        this.Nombre = "kala";
        this.Género = "hembra";
        this.Raza = "Mestizo";
    }*/
    //Constructor con parametros
    public Animales(String Nombre, String Género, String Raza) {
        this.Nombre = Nombre;
        this.Género = Género;
        this.Raza = Raza;
    }

//Métodos
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGénero() {
        return Género;
    }

    public void setGénero(String Género) {
        this.Género = Género;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public void mostrarA() {
        System.out.println("El Nombre es: " + Nombre);
        System.out.println("El Género es: " + Género);
        System.out.println("La Raza es: " + Raza);
    }
}
