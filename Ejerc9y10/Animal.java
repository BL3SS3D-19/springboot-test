public abstract class Animal {
    
    protected String nombre;
    protected abstract void hacerSonido();
    public abstract void comer();

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        
        Animal[] animales = new Animal[3];
        
        animales[0] = new Perro("Pero Firulais");
        animales[1]= new Gato("Gato Mazapan");
        animales[2] = new Vaca("Vaca Manuela");

        for(Animal animal: animales) {
            animal.hacerSonido();
            animal.comer();
        }
    }

    
}
