package clase11;

public class Alumno {

    static String nombre = "Felipe Farias";

    static void decorarNombre()
    {
        String nombre = "Felipe Farias";
        nombre = nombre + " - Es alumno regular";
    }

    public static void main(String[] args) {

        decorarNombre();
        System.out.println(nombre);

    }

}
