public class AnimalSRP {
    private String nombre;
    private String sonido;
    private String raza;
    private String alimentacion;
    private String habitad;

    public AnimalSRP(String nombre, String raza, String alimentacion, String habitad) {
        this.nombre = nombre;
        this.raza = raza;
        this.alimentacion = alimentacion;
        this.habitad = habitad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }
}
