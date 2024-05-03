public class Pelicula {
    String nombre;
    int fechaLanzamiento;
    double evaluacion;
    boolean includioEnElPlanBasico;
    String sipnosis;
    int tiempoDeDuracionEnMinutos;

    public Pelicula () {
        this.nombre = "";
        this.fechaLanzamiento = 0;
        this.evaluacion = 0.0;
        this.includioEnElPlanBasico = false;
        this.sipnosis = "";
        this.tiempoDeDuracionEnMinutos = 0;
    }

    public Pelicula(String nombre, int fechaLanzamiento, double evaluacion, boolean includioEnElPlanBasico, String sipnosis, int tiempoDeDuracionEnMinutos) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.evaluacion = evaluacion;
        this.includioEnElPlanBasico = includioEnElPlanBasico;
        this.sipnosis = sipnosis;
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
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

    public double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(double evaluacion) {
        this.evaluacion = evaluacion;
    }

    public boolean isIncludioEnElPlanBasico() {
        return includioEnElPlanBasico;
    }

    public void setIncludioEnElPlanBasico(boolean includioEnElPlanBasico) {
        this.includioEnElPlanBasico = includioEnElPlanBasico;
    }

    public String getSipnosis() {
        return sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    public void muestraFichaTecnica (){
        System.out.println("Ficha técnica de la película");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fecha de lanzamiento: " + this.fechaLanzamiento);
        System.out.println("Evaluación: " + this.evaluacion);
        System.out.println("Incluido en el plan básico: " + this.includioEnElPlanBasico);
        System.out.println("Sipnosis: " + this.sipnosis);
        System.out.println("Tiempo de duración en minutos: " + this.tiempoDeDuracionEnMinutos);
    }

}
