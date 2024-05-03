import modelo.Pelicula;
import modelo.Serie;

public class Main {
    public static void main(String[] args) {
//        Ejemplo de Clase, Película de Matrix
        Pelicula matrix = new Pelicula();
        matrix.setNombre("Matrix");
        matrix.setFechaLanzamiento(1999);
        matrix.setIncludioEnElPlanBasico(true);
        matrix.setDuracionEnMinutos(136);
        matrix.setDirector("Hermanas Wachowski");

//        Ejemplo Propio de Película Avengers
        Pelicula avengers = new Pelicula();
        avengers.setNombre("Avengers");
        avengers.setFechaLanzamiento(2012);
        avengers.setIncludioEnElPlanBasico(true);
        avengers.setDuracionEnMinutos(143);
        avengers.setDirector("Joss Whedon");

//        Imprimir Ficha Técnica de Películas
        matrix.muestraFichaTecnica();
        System.out.println("------------------------------------------------");
        avengers.muestraFichaTecnica();

//        Series
        Serie OnePiece = new Serie();
        OnePiece.setNombre("One Piece");
        OnePiece.setFechaLanzamiento(1999);
        OnePiece.setIncludioEnElPlanBasico(true);
        OnePiece.setTemporadas(20);
        OnePiece.setEpisodiosPorTemporada(100);
        OnePiece.setDuracionEnMinutosPorEpisodio(25);
        System.out.println("------------------------------------------------");
        OnePiece.muestraFichaTecnica();

        Principal principal = new Principal();
        System.out.println("------------------------------------------------");
        principal.muestraElMenu();
    }
}