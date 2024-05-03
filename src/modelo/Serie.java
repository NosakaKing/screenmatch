package modelo;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionEnMinutosPorEpisodio;

    public Serie() {
        this.temporadas = 0;
        this.episodiosPorTemporada = 0;
        this.duracionEnMinutosPorEpisodio = 0;
    }

    public Serie(int temporadas, int episodiosPorTemporada, int duracionEnMinutosPorEpisodio) {
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracionEnMinutosPorEpisodio() {
        return duracionEnMinutosPorEpisodio;
    }

    public void setDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio) {
        this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }

    @Override
    public int getDuracionEnMinutos() {
        return this.temporadas * this.episodiosPorTemporada * this.duracionEnMinutosPorEpisodio;
    }

    public void muestraFichaTecnica() {
        System.out.println("Ficha técnica de Serie");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Fecha de Lanzamiento: " + getFechaLanzamiento());
        System.out.println("Incluido en el Plan Básico: " + getIncludioEnElPlanBasico());
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episodios por Temporada: " + episodiosPorTemporada);
        System.out.println("Duración en Minutos por Episodio: " + duracionEnMinutosPorEpisodio);
        System.out.println("Duración Total en Minutos: " + getDuracionEnMinutos());
    }
}
