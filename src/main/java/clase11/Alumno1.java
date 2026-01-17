package clase11;

public class Alumno1 {

    static boolean esAprobado = true; //variable global, atributo de clase

    static void verificarAprobado()
    {
        String aprobado = "Genial, estás aprobado!!"; //variables locales
        String desaprobado = "Lamentablemente, no aprobaste!!!";

        if(esAprobado)
        {
            String adicional = " nos vemos el próximo año";
            System.out.println(aprobado + adicional);
        }else{
            System.out.println(desaprobado);
        }
    }

    static void cambiarEstado()
    {
        esAprobado = false;
    }

    public static void main(String[] args) {
        verificarAprobado();
        cambiarEstado();
        verificarAprobado();
    }

}
