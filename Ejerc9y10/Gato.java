public class Gato extends Animal{

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El " + this.nombre + " hace miau");
    }
    public void comer() {
        System.out.println("El "+ this.nombre + " ha comido pescado");
    }
}
