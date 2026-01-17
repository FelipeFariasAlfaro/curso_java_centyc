package clase10;

public class Variables {


    public static void main(String[] args) {

        //declaración e inicializacion de una variables
        int numero1 = 3000;
        System.out.println(numero1);
        //cambio del valor
        numero1 = 40;
        System.out.println(numero1);

        int numero2 = 40;
        numero2 = numero2 + 100;
        System.out.println("el resultado de la suma es: "+numero2);

        //concatenación de Strings
        String nombre = "Juan";
        nombre = nombre + " y tengo " + numero2 + " pesos en mi cuenta";
        System.out.println("Hola soy " + nombre);

        String saldo = "Mi saldo es: ";
        System.out.println(saldo + (1000 + 999));

    }

}
