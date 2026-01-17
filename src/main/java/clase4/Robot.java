package clase4;

public class Robot {

    int peso;
    String nombre;
    String origen;

    public Robot(String nombre, String origen, int peso)
    {
        this.nombre = nombre;
        this.origen = origen;
        this.peso = peso;
    }

    public void saludoDeRobot()
    {
        System.out.println("Hola soy el robot "+nombre+" vengo de "+origen+" y peso "+peso+" Kilos.");
    }

}
