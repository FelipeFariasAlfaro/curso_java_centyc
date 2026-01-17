package clase11;

public class NavegadorWeb {

    static String nombre = "CentycBrowser";
    static String estado = "Cerrado";
    static int pestaniaAbiertas = 0;

    static void cambioNombre(String nuevoNombre)
    {
        nombre = nuevoNombre;
    }

    static void cambioestado(String nuevoEstado)
    {
        estado = nuevoEstado;
    }

    static void abrirPentania()
    {
        pestaniaAbiertas = pestaniaAbiertas + 1;
    }

    public static void main(String[] args) {

        cambioNombre("Navegador de Prueba");
        cambioestado("Cerrado");
        abrirPentania();
        abrirPentania();
        abrirPentania();
        pestaniaAbiertas = 0;
        System.out.println("el navegador es: "+nombre);
        System.out.println("el estado es: "+estado);
        System.out.println("las tabs abiertas son: "+pestaniaAbiertas);

    }

}
