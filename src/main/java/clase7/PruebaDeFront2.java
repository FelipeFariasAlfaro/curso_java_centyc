package clase7;

public class PruebaDeFront2 {

    public static void main(String[] args) {
        System.out.println("Iniciando mi prueba fantastica");
        System.out.println("==============================");
        iniciaNavegador();
        System.out.println("==============================");
        System.out.println("Prueba finalizada por Felipe Farias");
    }

    public static void iniciaNavegador()
    {
        System.out.println("Iniciando Google Chrome....");
        irALaUrl();
    }

    public static void irALaUrl()
    {
        System.out.println("Me dirigo a centyc.cl");
        completoFormulario();
    }

    public static void completoFormulario()
    {
        System.out.println("Ingreso los datos en el formulario");
        presionoEnter();
    }

    public static void presionoEnter()
    {
        System.out.println("Presionando Enter");
        validacion();
    }

    public static void validacion()
    {
        System.out.println("Validando mensaje de exito....");
        System.out.println("Prueba exitosa");
    }

}
