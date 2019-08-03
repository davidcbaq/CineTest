public class Asiento {
    private String letraUbicacion;
    private int numeroDeFila;
    private boolean ocupado;

    public Asiento(String letraUbicacion, int numeroDeFila, boolean ocupado) {
        this.letraUbicacion = letraUbicacion;
        this.numeroDeFila = numeroDeFila;
        this.ocupado = ocupado;
    }

    public String getLetraUbicacion() {
        return letraUbicacion;
    }

    public void setLetraUbicacion(String letraUbicacion) {
        this.letraUbicacion = letraUbicacion;
    }

    public int getNumeroDeFila() {
        return numeroDeFila;
    }

    public void setNumeroDeFila(int numeroDeFila) {
        this.numeroDeFila = numeroDeFila;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
