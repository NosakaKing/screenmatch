package modelo;

public class Titulo {
    private String nombre;
    private int fechaLanzamiento;
    private boolean includioEnElPlanBasico;
    private int duracionEnMinutos;

    public Titulo() {
        this.nombre = "";
        this.fechaLanzamiento = 0;
        this.includioEnElPlanBasico = false;
        this.duracionEnMinutos = 0;
    }

    public Titulo(String nombre, int fechaLanzamiento, boolean includioEnElPlanBasico, int duracionEnMinutos) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.includioEnElPlanBasico = includioEnElPlanBasico;
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public boolean getIncludioEnElPlanBasico() {
        return includioEnElPlanBasico;
    }

    public void setIncludioEnElPlanBasico(boolean includioEnElPlanBasico) {
        this.includioEnElPlanBasico = includioEnElPlanBasico;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

}
