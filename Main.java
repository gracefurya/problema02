
public class Main {

    public static void main(String[] args) {

        System.out.println("Veterinaria N°1");
        Veterinaria v1 = new Veterinaria("Mexico", "central", 451112);
        v1.mostrarV();
        System.out.println("Veterinaria N°2");
        Veterinaria v2 = new Veterinaria("Los Alamos", "Norte", 12783);
        v2.mostrarV();
        System.out.println("Veterinaria N°3");
        Veterinaria v3 = new Veterinaria("Rodriguez", "Sur", 454555);
        v3.mostrarV();

        System.out.println("Persona N°1");
        Persona p1 = new Persona("Alan", "Perez", 28, 12253);
        p1.mostrarP();

        System.out.println("Persona N°2");
        Persona p2 = new Persona("Juan", "Lopez", 52, 577772);
        p2.mostrarP();

        System.out.println("Persona N°3");
        Persona p3 = new Persona("Sol", "Murillo", 42, 42443);
        p3.mostrarP();

        System.out.println("Animal N°1");
        Animales a1 = new Animales("Leo", "M", "Mestizo");
        a1.mostrarA();
        System.out.println("Animal N°2");
        Animales a2 = new Animales("Niebla", "H", "Chihuahua");
        a2.mostrarA();
        System.out.println("Animal N°3");
        Animales a3 = new Animales("Kitty", "H", "Pátor Aleman");
        a3.mostrarA();

    }

}
