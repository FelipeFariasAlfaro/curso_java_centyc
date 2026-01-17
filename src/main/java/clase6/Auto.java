package clase6;

public class Auto {

    boolean esElectrico;
    int peso;
    int anio;
    String color;

    public Auto()
    {}

    public Auto(boolean esElectrico)
    {
        this.esElectrico = esElectrico;
        //this.peso = peso;
        //this.anio = anio;
        //this.color = color;
    }

    public Auto(boolean esElectrico, int peso, int anio, String color)
    {
        this.esElectrico = esElectrico;
        this.peso = peso;
        this.anio = anio;
        this.color = color;
    }


}
