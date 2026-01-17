package clase6;

public class FabricaDeAutos {

    public static void main(String[] args) {

        Auto auto1 = new Auto();
        System.out.println("¿Es eléctrico? "+auto1.esElectrico);
        System.out.println("¿Peso? "+auto1.peso);
        System.out.println("¿Año? "+auto1.anio);
        System.out.println("¿Color? "+auto1.color);

        System.out.println("==========================================");
        System.out.println("Auto 2");
        Auto auto2 = new Auto(true, 1000, 2025, "Azul");
        System.out.println("¿Es eléctrico? "+auto2.esElectrico);
        System.out.println("¿Peso? "+auto2.peso);
        System.out.println("¿Año? "+auto2.anio);
        System.out.println("¿Color? "+auto2.color);

        System.out.println("==========================================");
        System.out.println("Auto 3");
        Auto auto3 = new Auto(true);
        System.out.println("¿Es eléctrico? "+auto3.esElectrico);
        System.out.println("¿Peso? "+auto3.peso);
        System.out.println("¿Año? "+auto3.anio);
        System.out.println("¿Color? "+auto3.color);

    }

}
