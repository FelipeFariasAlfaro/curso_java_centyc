package clase16;

import java.util.Scanner;

public class EjemploScanner {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scan.nextLine();
        //System.out.println("Tu nombre es: "+nombre);

        System.out.print("Ingresa tu edad: ");
        int edad = scan.nextInt();

        System.out.print("Ingresa tu calificiación: ");
        double calificacion = scan.nextDouble();

        System.out.println("Tu nombre es: "+nombre+", tu edad es :"+edad+ " y tu calificación final es: "+calificacion);

    }

}
