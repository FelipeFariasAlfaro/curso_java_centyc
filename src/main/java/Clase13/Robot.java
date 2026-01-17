package Clase13;

public class Robot {

    int anioFabricacion;
    int peso;
    String modelo;
    boolean esRecargable;
    char inicial;

    public Robot(){}

    //caso con 1 argumento, podria ser cualquier argumento
    public Robot(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    //con 2 argumentos
    public Robot(int anioFabricacion, int peso) {
        this.anioFabricacion = anioFabricacion;
        this.peso = peso;
    }

    //con 3 argumentos
    public Robot(int anioFabricacion, int peso, String modelo) {
        this.anioFabricacion = anioFabricacion;
        this.peso = peso;
        this.modelo = modelo;
    }

    //con 4 argumentos
    public Robot(int anioFabricacion, int peso, String modelo, boolean esRecargable) {
        this.anioFabricacion = anioFabricacion;
        this.peso = peso;
        this.modelo = modelo;
        this.esRecargable = esRecargable;
    }

    //con 5 argumentos
    public Robot(int anioFabricacion, int peso, String modelo, boolean esRecargable, char inicial) {
        this.anioFabricacion = anioFabricacion;
        this.peso = peso;
        this.modelo = modelo;
        this.esRecargable = esRecargable;
        this.inicial = inicial;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public int getPeso() {
        return peso;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isEsRecargable() {
        return esRecargable;
    }

    public char getInicial() {
        return inicial;
    }


}
