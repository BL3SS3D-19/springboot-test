public class Triangulo extends Figura {
    protected double base;
    protected double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        double area = (this.base * this.altura) / 2; 
        System.out.println("El area del triangulo es: " + area);
    }

    public void dibujar() {
        System.out.println("El triangulo ha sido dibujado");
    }

}
