public abstract class Figura {

    abstract void calcularArea();

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(5, 5);
        Cuadrado c1 = new Cuadrado (5);
        t1.calcularArea();
        t1.dibujar();
        c1.calcularArea();
        c1.dibujar();
    }
}

