package Clase13;

public class FabricaDeRobots {

    public static void main(String[] args) {

        Robot robot1 = new Robot(2000);
        System.out.println("El año de fabricacion es: "+robot1.getAnioFabricacion());
        System.out.println("El peso del robot es: "+ robot1.getPeso());
        System.out.println("===========================");
        Robot robot4 = new Robot(2025, 100, "Tesla", true);
        System.out.println("El año de fabricacion del robot 4 es: "+robot4.getAnioFabricacion());
        System.out.println("El peso del robot 4 es: "+ robot4.getPeso());
        System.out.println("El modelo del robot 4 es: "+ robot4.getModelo());
        System.out.println("¿El robot 4 es recargable? " + robot4.isEsRecargable());

        Robot equis = new Robot();

    }
}
