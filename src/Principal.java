import modelo.Pelicula;
import modelo.Serie;
import modelo.Titulo;

import java.util.Scanner;

public class Principal {
    Scanner teclado = new Scanner(System.in);
    Pelicula nuevaPelicula = new Pelicula();
    Serie nuevaSerie = new Serie();

    public void muestraElMenu() {
        int opcion = 0;
        while (opcion != 9) {
            String menu = """
                    Bienvenido a la plataforma de streaming
                    1. Registrar nueva película
                    2. Registrar nueva serie
                    3. Calcular el tiempo que nos tomaría ver todas las temporadas de una serie
                    
                    9. Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    datosTitulo();
                    System.out.println("Ingresa la duración en minutos");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresa el nombre del director");
                    String director = teclado.nextLine();
                    nuevaPelicula.setDuracionEnMinutos(duracionEnMinutos);
                    nuevaPelicula.setDirector(director);
                    nuevaPelicula.muestraFichaTecnica();
                    break;

                case 2:
                    datosTitulo();
                    System.out.println("Ingresa el número de temporadas");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresa el número de episodios por temporada");
                    int episodiosPorTemporada = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresa la duración en minutos por episodio");
                    int duracionEnMinutosPorEpisodio = teclado.nextInt();
                    teclado.nextLine();
                    nuevaSerie.setTemporadas(temporadas);
                    nuevaSerie.setEpisodiosPorTemporada(episodiosPorTemporada);
                    nuevaSerie.setDuracionEnMinutosPorEpisodio(duracionEnMinutosPorEpisodio);
                    nuevaSerie.muestraFichaTecnica();
                    break;

                case 3:
                    calcularTiempoTotal();
                    break;

                case 9:
                    System.out.println("Gracias por usar la plataforma de streaming");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    public void datosTitulo() {
        System.out.println("Ingresa el nombre");
        String nombre = teclado.nextLine();
        System.out.println("Ingresa el año de lanzamiento");
        int fechaLanzamiento = teclado.nextInt();
        teclado.nextLine();
        System.out.println("¿Está incluida en el plan básico? (true/false)");
        boolean incluidoEnElPlanBasico = teclado.nextBoolean();
//        Pelicula
        nuevaPelicula.setNombre(nombre);
        nuevaPelicula.setFechaLanzamiento(fechaLanzamiento);
        nuevaPelicula.setIncludioEnElPlanBasico(incluidoEnElPlanBasico);

//        Serie
        nuevaSerie.setNombre(nombre);
        nuevaSerie.setFechaLanzamiento(fechaLanzamiento);
        nuevaSerie.setIncludioEnElPlanBasico(incluidoEnElPlanBasico);
    }

    public void calcularTiempoTotal() {
        System.out.println("Ingresa el número de temporadas");
        int temporadasSerie = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingresa el número de episodios por temporada");
        int episodiosPorTemporadaSerie = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingresa la duración en minutos por episodio");
        int duracionEnMinutosPorEpisodioSerie = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingresa el número de horas diarias que verías la serie");
        int horasDiarias = teclado.nextInt();
        teclado.nextLine();
        int duracionTotal = temporadasSerie * episodiosPorTemporadaSerie * duracionEnMinutosPorEpisodioSerie;
        int dias = duracionTotal / (horasDiarias * 60);
        int horas = (duracionTotal % (horasDiarias * 60)) / 60;
        System.out.println("Te tomaría " + dias + " días y " + horas + " horas ver la serie");
    }

}
