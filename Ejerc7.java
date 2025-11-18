public class Ejerc7 {
    
    public static void mostrarNumeros(int numero) {
        while(numero <= 50) {
            System.out.println(numero);
            numero++;
        }
    }

    public static void mostrarNumerosImpares(int numero) {
        while(numero<= 50) {
            if(numero%2!=0) {
                System.out.println(numero);
            }
            numero++;
        }
    }

    public static void main(String[] args) {
        int numero = 0;
        mostrarNumeros(numero);
        mostrarNumerosImpares(numero);
    }


}
