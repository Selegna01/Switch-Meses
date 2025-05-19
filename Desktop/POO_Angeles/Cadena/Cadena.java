//Inicio del programa
import java.util.Scanner;
public class Cadena{
    public static void main(String[]args){
        Scanner almacenar = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = almacenar.nextLine();
        System.out.println("Escribe tu apellido Paterno:");
        String apellido_Paterno = almacenar.nextLine();
        System.out.println("Escribe tu apellido Materno: ");
        String apellido_Materno = almacenar.nextLine();
        

       System.out.println("Tu nombre es: " + nombre + " " + apellido_Paterno + " " + apellido_Materno); //donde nombre, es utilizado para escanear el nombre ingresado.
    }
}
//Codigo listo.