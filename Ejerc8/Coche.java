
import java.util.Date;

public class Coche {
    private String marca;
    private String modelo;
    private int anio;
    
    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void mostrarInfo() {
        System.out.println("El coche es: " + this.marca + " "+  this.modelo + " del año "+ this.anio);
    }

    public static void main(String[] args) {
        Coche c1 = new Coche("Ford", "Mondeo", 2002 );
        c1.mostrarInfo();
    }
}
