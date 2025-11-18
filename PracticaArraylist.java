
import java.util.ArrayList;
import java.util.Scanner;

public class PracticaArraylist {
    
    public static void addNombres(ArrayList<String> nombres) {
        
        System.out.println("Introduce un nombre o stop para terminar el programa");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        switch(nombre) {
            case "stop":
                break;
            default:
                nombres.add(nombre);
                addNombres(nombres);
        }
       
    }
    
    public static void main(String[] args) {
        ArrayList <String> nombres = new ArrayList<>();
        nombres.add("Pablo");
        nombres.add("Pepe");
        nombres.add("Patricio");
        nombres.add("Petra");
        nombres.add("Perico");
        addNombres(nombres);

        
        
        for(String nombre: nombres) {
            System.out.println(nombre);
        }

    }
}
