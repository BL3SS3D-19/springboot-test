
import java.util.Scanner;

public class Ejerc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero por consola");
        int numero = Integer.parseInt(sc.nextLine());
        String tipo;
        char calificacion;

        if(numero < 0) {
            tipo = "negativo";
        }else if (numero > 0){
            tipo = "positivo";
        }else{
            tipo = "0";
        }

        
        
        switch(numero) {
            case 10:
            case 9:
                calificacion = 'A';
                break;
            case 8:
                calificacion = 'B';
                break;
            case 7:
            case 6:
                calificacion = 'C';
                break;
            case 5:
                calificacion = 'D';
                break;
            default:
                calificacion = 'F';
                break;
        }
        System.out.println("EL numero introducido " +numero+ " es "+ tipo + " La nota es " + calificacion);

       
    }
}
