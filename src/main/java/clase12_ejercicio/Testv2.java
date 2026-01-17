package clase12_ejercicio;

public class Testv2 {

    String titulo;
    String objetivo;
    int cantidadPasos;
    boolean estado;

    public void iniciarTest(String titulo1, String objetivo1, int pasos1, boolean estado1)
    {
        titulo = titulo1;
        objetivo = objetivo1;
        cantidadPasos = pasos1;
        estado = estado1;
    }

    public void addPasos(int pasos)
    {
        cantidadPasos = cantidadPasos + pasos;
    }

    public void finalizarTest()
    {
        estado = false;
    }

    public String verificarEstado()
    {
        //String result = "¿La prueba se está ejecutando? -> "+estado;
        //return result;
        return "¿La prueba se está ejecutando? -> "+estado;
    }

    public int obtenerPasos()
    {
        return cantidadPasos;
    }

    public String obtenerTitulo()
    {
        return titulo;
    }

    public String obtenerObjetivo()
    {
        return objetivo;
    }

}
