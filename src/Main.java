import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("Película Matrix");
        double mediaEvaluacionUsuario = 0;
        int fechaDeLanzamiento = 1999;
        double evaluacion = 9.5;
        boolean esBuena = true;

        String titulo = "Matrix";
        String sipnosis = "Un pirata informático descubre la verdad sobre la realidad y su papel en la guerra contra los controladores.";
        System.out.println("Título: " + titulo);
        System.out.println("Sipnosis: " + sipnosis);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Es buena: " + esBuena);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de evaluación: " + mediaEvaluacion);
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce tu evaluación que le darías a Matrix: ");
            double evaluacionUsuario = teclado.nextDouble();
            mediaEvaluacionUsuario = (mediaEvaluacionUsuario + evaluacionUsuario);
        }
        System.out.println("Media de evaluación de los usuarios: " + mediaEvaluacionUsuario / 3);
    }
}