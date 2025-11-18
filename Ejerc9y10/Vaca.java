public class Vaca extends Animal{
    public Vaca(String nombre) {
        super(nombre);
    }


    @Override
    public void hacerSonido() {
        System.out.println("La " + this.nombre + " hace muuuu");
    }
    public void comer() {
        System.out.println("La " + this.nombre+ " ha comido pasto");
    }

}
