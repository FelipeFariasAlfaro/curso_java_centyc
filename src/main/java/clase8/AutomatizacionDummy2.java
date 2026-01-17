package clase8;

public class AutomatizacionDummy2 {

    public static void main(String[] args) {
        String navegador = "Chrome";
        String url = "https://centyc.cl";
        int tiempo =  10;
        int ancho = 1800;
        int alto = 900;

        System.out.println("Iniciando prueba");
        System.out.println("_________________");
        activarNavegador(navegador);
        irALaUrl(url);
        revisarCarga(tiempo);
        redimencionar(ancho, alto);

    }

    public static void activarNavegador(String navegador)
    {
        System.out.println("Iniciando el navegador: " + navegador);
    }

    public static void irALaUrl(String url)
    {
        System.out.println("dirigiendonos a la url: " + url);

    }

    public static void revisarCarga(int tiempo)
    {
        System.out.println("La pagina debe cargar en menos de :" + tiempo +" segundos.");
    }

    public static void redimencionar(int x, int y)
    {
        System.out.println("Redimencionaremos la ventana a un ancho de :" + x + " y  un alto de :" + y);
    }

}
