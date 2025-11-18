
import java.lang.reflect.Array;

public class PracticaArrays {
    public static int findMax(int[] numeros) {
        int max = numeros[0];

        for(int num : numeros) {
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] numeros) {
        int min = numeros[0];

        for(int num : numeros) {
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        
        
        int[] numeros = {0,20,30,40,50};
        for(int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            

        }
        System.out.println("Valor maximo: "+ findMax(numeros) + " Valor minimo: " + findMin(numeros));
    }

}
