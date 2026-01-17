package clase9;

public class EjemplosConReturn {

    public static void main(String[] args) {

        int result = suma(5656 , 20);
        System.out.println("el resultado es: "+result);

        String saludo1 = saludo("Felipe");
        System.out.println(saludo1);

        boolean estaNubladoV1 = estaNublado(0);
        System.out.println("Esta nublado version1: "+estaNubladoV1);

        boolean estaNubladoV2 = estaNublado(3);
        System.out.println("Esta nublado version2: "+estaNubladoV2);

        int resultadoecuacion = ecuacion(20, 44, 100);
        System.out.println("El resultado es: "+resultadoecuacion);

    }
    //resta: -
    //multiplicacion: *
    //division: /
    //resto de la division: %
    public static int suma(int a, int b)
    {
        int resultado = a + b;
        return resultado;
    }

    public static String saludo(String nombre)
    {
        String saludocompleto = "Hola, te saluda "+nombre;
        return saludocompleto;
    }

    public static boolean estaNublado(int validador)
    {
        if(validador == 0)
        {
            return false;
        }else{
            return true;
        }
    }

    public static int ecuacion(int a, int b, int c)
    {
        return ((a + b + c) - 5 + (b * c));
    }


}
