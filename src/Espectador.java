public class Espectador {
    private String nombre;
    private int edad;
    private int dineroQueTiene;

    public Espectador(String nombre, int edad, int dineroQueTiene) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroQueTiene = dineroQueTiene;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDineroQueTiene() {
        return dineroQueTiene;
    }

    public void setDineroQueTiene(int dineroQueTiene) {
        this.dineroQueTiene = dineroQueTiene;
    }
}
