import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tarea: Aplanar un arreglo bidimensional en un nivel y eliminar repetidos\n");

        String[][] Arreglo_lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}};
        System.out.println("Arreglo_lenguajes = " + Arrays.deepToString(Arreglo_lenguajes) + "\n");

        for (String[] arregloLenguaje : Arreglo_lenguajes) {    /*Arreglo_lenguajes visto en forma de matriz*/
            for (String s : arregloLenguaje) {
                System.out.print(s + "\t\t");
            }
            System.out.println();
        }

        Stream<String> Stream_lenguajes = Arrays.stream(Arreglo_lenguajes)  /*Convertir de tipo 'Array' a 'Stream'*/
                                                .flatMap(Arrays::stream)    /*Aplanar Stream*/
                                                .distinct();    /*Eliminar elementos repetidos*/

        String[] resultado = Stream_lenguajes.toArray(String[]::new);   /*Convertir 'Stream' en 'Array'*/
        System.out.println("\nResultado = " + Arrays.toString(resultado));
    }
}