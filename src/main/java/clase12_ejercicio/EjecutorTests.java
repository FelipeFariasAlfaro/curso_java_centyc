package clase12_ejercicio;

public class EjecutorTests {


    public static void main(String[] args) {
        System.out.println("========== Ejecutor de Tests ===========");
        System.out.println();
/*
        Test test1 = new Test();
        test1.iniciarTest("Probar el login de google", "Verificar cambios al login");
        String mensaje = test1.obtenerEstadoDelTest();
        System.out.println(mensaje);
        System.out.println();
        System.out.println("=================================");
        System.out.println();

        Test test2 = new Test();
        test2.iniciarTest("Probar videos de youtube", "Verificar cambios en videos");
        test2.addPaso();
        test2.addPaso();
        test2.addPaso();
        test2.setearActual(false);
        System.out.println(test2.obtenerEstadoDelTest());
    */

        //Version 2 de la clase test
        System.out.println("========== Ejecutor de Tests V2 ===========");
        System.out.println();

        Testv2 tV2 = new Testv2();
        tV2.iniciarTest("Prueba breve", "Validar el loading", 5, true);
        System.out.println(tV2.verificarEstado());
        System.out.println("EL titulo es: "+tV2.obtenerTitulo());
        System.out.println("EL objetivo es: "+tV2.obtenerObjetivo());
        tV2.addPasos(15);
        System.out.println("La cantidad de pasos es: "+tV2.obtenerPasos());
        tV2.finalizarTest();
        System.out.println(tV2.verificarEstado());

    }


}
