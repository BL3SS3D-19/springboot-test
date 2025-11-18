public class PracticaDatosPrimitivos{
    
     public static double calcularAreaCirculo(double radio){
            return (Math.PI * Math.pow(radio,2));
        }
    public static void main(String[] args) {
        // Declararamos variables 
        int numeroEntero;
        byte numeroPequeno;
        boolean esVerdadero;
        char letra;
        double numeroDecimal;
        long numeroLargo;

        // Asignamos valores a cada variable
        numeroEntero = 25;
        numeroPequeno = 10;
        esVerdadero = true;
        letra = 'A';
        numeroDecimal = 3.1416;
        numeroLargo = 123456789L;

        // Imprimimos los valores en consola
        System.out.println("Valor de int: " + numeroEntero);
        System.out.println("Valor de byte: " + numeroPequeno);
        System.out.println("Valor de boolean: " + esVerdadero);
        System.out.println("Valor de char: " + letra);
        System.out.println("Valor de double: " + numeroDecimal);
        System.out.println("Valor de long: " + numeroLargo);

        
        System.out.println("El area del circulo es: " + calcularAreaCirculo(5));

       
    }
}
