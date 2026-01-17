package clase17;

import java.util.Scanner;

public class EjemploSwitch {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa el navegador a testear: ");
        String browser = scan.nextLine();
        /*toLowerCase -> pasa todo el string a minúsculas*/

        switch (browser.toLowerCase()){
            case "chrome":
                System.out.println("iniciando Google Chrome - Chrome Driver");
                break;
            case "edge":
                System.out.println("iniciando Microsoft Edge");
                break;
            case "mozilla":
                System.out.println("iniciando Mozilla");
                break;
            default:
                System.out.println("Navegador no soportado");
                break;
        }
        
    }

}
