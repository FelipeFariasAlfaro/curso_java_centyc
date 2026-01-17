package clase8;

public class AutomatizacionDummy {

    public static void main(String[] args) {

        System.out.println("Iniciando prueba");
        System.out.println("_________________");
        activarNavegador("Chrome");
        irALaUrl("https://centyc.cl");
        revisarCarga(10);
        redimencionar(1800, 600);

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
