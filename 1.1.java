import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //datos de la piscina uno
        final float largoPiscina1 = 300.3F;
        Scanner ancho1 = new Scanner(System.in);
        System.out.println("el ancho de la piscina 1 es: ");
        float anchoPiscina1 = ancho1.nextFloat();
        Scanner profundidad1 = new Scanner(System.in);
        System.out.println("la profundidad es: ");
        float profundidadPiscina1 = profundidad1.nextFloat();

        //hacemos traza de los valores ancho y profundidad 1
        System.out.println("el ancho de la piscina 1 es: " + anchoPiscina1 + " y la profundidad es: " + profundidadPiscina1);

        //datos de la piscina dos
        final float largoPiscina2 = 300.3F;
        Scanner ancho2 = new Scanner(System.in);
        System.out.println ("el ancho de la piscina 2 es: ");
        float anchoPiscina2 = ancho2.nextFloat();
        Scanner profundidad2 = new Scanner(System.in);
        System.out.println("el ancho de la piscina 2 es: " + anchoPiscina2 + " y la profundidad es: " + profundidad2);
        float profundidadPiscina2 = profundidad2.nextFloat();

        //hacemos traza de los valores ancho y prufundidad
        System.out.println("el ancho de la piscina 2 es: " + anchoPiscina2 + " y la profundidad es: " + profundidadPiscina2);

        //variables que nos serviran para calcular area y volumen de piscinas
        int areaPiscina1 = (int) (anchoPiscina1 * largoPiscina1);
        int volumenPiscina1 = (int)(areaPiscina1 * profundidadPiscina1);
        int areaPiscina2 = (int)(anchoPiscina2 * largoPiscina2);
        int volumenPiscina2 = (int)(areaPiscina2 * profundidadPiscina2);

        //vamos a crear datos de las dos piscinas juntas una al lado de la otra
        float anchoTotalPiscinas = anchoPiscina1 + anchoPiscina2;
        int areaTotalPiscinas = areaPiscina1 + areaPiscina2;
        int volumenTotalPiscinas = volumenPiscina1 + volumenPiscina2;

        //mostrar resultados en pantalla: area, volumen, longitud total,
        //ancho total, area total y volumen total
        System.out.println("El área de la piscina 1 es: " + areaPiscina1);
        System.out.println("El área de la piscina 2 es: " + areaPiscina2);
        System.out.println("El volumen de la piscina 1 es: " + volumenPiscina1);
        System.out.println("El volumen de la piscina 2 es: " + volumenPiscina2);
        System.out.println("La longitud total de las dos piscinas juntas es: " + largoPiscina1);
        System.out.println("El ancho de las dos piscinas juntas es: " + anchoTotalPiscinas);
        System.out.println("El área total de la dos piscinas juntas es: " + areaTotalPiscinas);
        System.out.println("El volumen total de las dos piscinas juntas es: " + volumenTotalPiscinas);

        //punto de parada antes de intercambiar
        System.out.println("la profundidad de la piscina 1 es: " + profundidadPiscina1 + " y el volumen: " + volumenPiscina1);
        System.out.println("la profundidad de la piscina 2 es: " + profundidadPiscina2 + " y el volumen: " + volumenPiscina2);

        //intercambiamos los valores de profundidad de piscina 1 y 2
        float profundidadTemporalPiscina1 = profundidadPiscina1;
        profundidadPiscina1 = profundidadPiscina2;
        profundidadPiscina2 = profundidadTemporalPiscina1;

        //nueva operación de volumen de las piscinas
        int nuevoVolumenPiscina1 = (int)(areaPiscina1 * profundidadPiscina1);
        int nuevoVolumenPiscina2 = (int)(areaPiscina2 * profundidadPiscina2);

        //otro punto de parada después de intercambiar valores
        System.out.println("la nueva profundidad de la piscina 1 es: " + profundidadPiscina1 + " y el volumen" + nuevoVolumenPiscina1);
        System.out.println("la nueva profundidad de la piscina 2 es: " + profundidadPiscina2 + " y el volumen: " +  nuevoVolumenPiscina2);

        // imprimimos nuevos resultados con los datos de profundidad intercambiados
        System.out.println("El nuevo volumen de la piscina 1 es: " + nuevoVolumenPiscina1);
        System.out.println("El nuevo volumen de la piscina 2 es: " + nuevoVolumenPiscina2);


    }
}
