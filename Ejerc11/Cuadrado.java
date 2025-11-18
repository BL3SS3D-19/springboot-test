public class Cuadrado extends Figura implements Dibujable{
    
    protected double lado;
    public Cuadrado(double lado) {
        this.lado = lado;
    }


    @Override
    public void calcularArea() {
        double area = Math.pow(lado, 2);
        System.out.println("El area del cuadrado es: "+ area);
    }

    public void dibujar(){
        System.out.println("El Cuadrado ha sido dibujado");
    }



}
