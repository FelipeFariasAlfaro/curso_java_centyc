package clase15;

public class Condiciones {

    public static void main(String[] args) {

        //System.out.println("El estado del alumno 1 es: "+calificacion1(3.9));
        //System.out.println("El estado del alumno 2 es: "+calificacion2(7.0));
        //System.out.println("El estado del alumno 3 es: "+calificacion3(5.5));
        System.out.println("¿Es alumno? "+esAlumno("Maria"));
    }

    static public String calificacion1(double notaFinal)
    {
        if(notaFinal >= 4.0)
        {
            return "Aprobado";
        }

        return "No aprobado";
    }

    static public String calificacion2(double notaFinal)
    {
        if(notaFinal >= 4.0)
        {
            return "Aprobado";
        }
        else{
            return "No aprobado";
        }
    }

    static public String calificacion3(double notaFinal)
    {

        if(notaFinal>7.0){
            System.out.println("La calificación no es valida");
            return "Nota no valida";
        }

        if(notaFinal < 4.0)
        {
            return "No Aprobado";
        }
        else if(notaFinal >= 4.0 && notaFinal <= 6.0){
            return "Aprobado con éxito";
        }else{
            return "Aprobado con honores";
        }
    }

    static public String esAlumno(String nombre)
    {
        if(nombre.equals("Maria")){
            return "Es Alumna";
        }else{
            return "No es Alumna";
        }
    }

}
