package clase18;

import java.util.Scanner;

public class EjemplosFor {

    public static void main(String[] args) {

        /* Ejemplo basico
        for(int i=0; i < 50; i++ )
        {
            System.out.println("El valor de i es: "+i);
        }


        for(int i=50; i == 50; i++ )
        {
            System.out.println("El valor de i es: "+i);
        }
        */

        /*
            //ejemplo con scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el número del cual quieres conocer su tabla de multiplicación");
        int numero = scan.nextInt();

        for(int i = 1; i <= 12; i++)
        {
            int num_multiplicado = numero * i;
            System.out.println(i + " x " + numero+" = "+num_multiplicado);
        }
        */

        Scanner scanPalabras = new Scanner(System.in);
        System.out.print("Ingresa una palabra");
        String palabra = scanPalabras.nextLine();

        for(int i=0; i < palabra.length(); i++)
        {
            char letra = palabra.charAt(i); //Obtiene la letra de la palabra en la posición i
            System.out.println("La letra en la posición "+i+" es <<"+letra+">>");
        }

        //Recuerda el for iterará hasta donde le indiquemos en la validación booleana
        /*
        * Ej: la palabra "Computador"
        * si vemos la palabra por sus índices
        * índice   |  letra
        *   0     ->    C
        *   1     ->    o
        *   2     ->    m
        *   3     ->    p
        *   4     ->    u
        *   5     ->    t
        *   6     ->    a
        *   7     ->    d
        *   8     ->    o
        *   9     ->    r
        *
        * En este caso el for debe partir en 0 e iterar hasta 9 (no hasta 10)
        * */
    }
}
