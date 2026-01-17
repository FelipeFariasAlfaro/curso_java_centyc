package clase4;

public class FabricaDeRobots {

    public static void main(String arg[]){

        Robot robot1 = new Robot("Juanito", "China", 500);
        robot1.saludoDeRobot();

        Robot robot2 = new Robot("Federica", "Jamaica", 400);
        robot2.saludoDeRobot();

        Robot robot3 = new Robot("Felipe", "Chile", 1000);
        robot3.saludoDeRobot();


    }

}
