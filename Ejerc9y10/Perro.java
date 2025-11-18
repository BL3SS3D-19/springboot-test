public class Perro extends Animal{
    
    
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El " +this.nombre +" hace guau");
    }

    public void comer() {
        System.out.println("El "+ this.nombre + " ha comido carne");
    }
}
