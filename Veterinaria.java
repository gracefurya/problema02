
public class Veterinaria {

//Atributos de la clase
    private String Nombre;
    private String Dirección;
    private int Teléfono;

    /* Constructor sin parametros
     public Veterinaria() {
       this.Nombre = "Juan";
        this.Dirección = "Bolivar";
        this.Teléfono = 12345;
    }*/
//Constructor con parametros
    public Veterinaria(String Nombre, String Dirección, int Teléfono) {
        this.Nombre = Nombre;
        this.Dirección = Dirección;
        this.Teléfono = Teléfono;
    }

//Metodos
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public int getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(int Teléfono) {
        this.Teléfono = Teléfono;
    }

    public void mostrarV() {
        System.out.println("El Nombre es: " + Nombre);
        System.out.println("La Dirección es: " + Dirección);
        System.out.println("El Teléfono es: " + Teléfono);
    }
}
