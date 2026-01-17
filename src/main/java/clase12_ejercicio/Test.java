package clase12_ejercicio;

public class Test {

    String titulo;
    String objetivo;
    int cantidadPasos;
    boolean estado;

    public void iniciarTest(String titulo1, String objetivo1)
    {
        titulo = titulo1;
        objetivo = objetivo1;
        estado = true;
        cantidadPasos = 0;
    }


    public void addPaso()
    {
        cantidadPasos = cantidadPasos + 1;
    }

    public void setearActual(boolean estadoActual)
    {
        estado = estadoActual;
    }


    public String obtenerEstadoDelTest()
    {
        String mensaje = "El test <"+titulo+"> cuyo objetivo es <"+objetivo+"> y tiene "
                +cantidadPasos+" pasos, tiene estado:  "+estado;
        return mensaje;
    }


}
