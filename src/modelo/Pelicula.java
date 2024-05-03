package modelo;
public class Pelicula extends Titulo{
    private String director;

    public Pelicula() {
        this.director = "";
    }

    public Pelicula(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void muestraFichaTecnica() {
        System.out.println("Ficha técnica de Pelicula");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Fecha de Lanzamiento: " + getFechaLanzamiento());
        System.out.println("Incluido en el Plan Básico: " + getIncludioEnElPlanBasico());
        System.out.println("Duración en Minutos: " + getDuracionEnMinutos());
        System.out.println("Director: " + director);
    }

}
