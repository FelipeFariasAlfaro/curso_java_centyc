package clase14;

public class EjerciciosBooleanos {

    public static void main(String[] args) {

        boolean ej1 = 10 == 10;
        System.out.println("Ej1: "+ej1);

        boolean ej2 = 10 == 10001;
        System.out.println("Ej2: "+ej2);

        boolean ej3 = 10 > 9;
        System.out.println("Ej3: "+ej3);

        boolean ej4 = 10 > 10001;
        System.out.println("Ej4: "+ej4);

        boolean ej5 = 999999 >= 999999;
        System.out.println("Ej5: "+ej5);

        boolean ej6 = 10 <= 1;
        System.out.println("Ej6: "+ej6);

        boolean ej7 = 3.8 != 4.0;
        System.out.println("Ej7: "+ej7);

        System.out.println("========================");

        boolean operador1 = 100 == 100 && 2.3 == 2.3; //ambas comparaciones booleanas deben ser true
        System.out.println(operador1);

        boolean operador2 = 100 == 100 && 2.4 == 2.3;
        System.out.println(operador2);

        boolean operador3 = 99 == 99 || 2.4 == 2.3; //tan solo 1 condición debe ser verdadera
        System.out.println(operador3);

        boolean operador4 = 91 == 99 || 7.4 == 2.1; //tan solo 1 condición debe ser verdadera
        System.out.println(operador4);

        boolean operador5 = !true;
        System.out.println(operador5);

        boolean operador6 = !(678 != 111);
        System.out.println(operador6);

    }
}
