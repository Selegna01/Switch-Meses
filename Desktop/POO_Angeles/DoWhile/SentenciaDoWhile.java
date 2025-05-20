//Author:Estrada Romero Angeles
//Fecha:20/05/2025
//Descripción:Sentencia DoWhile, con contador de 1 hasta que e usuario teclee "n".
import java.util.Scanner;
public class SentenciaDoWhile{
     public static void main(String[] args){
       Scanner scanner = new Scanner (System.in);
        int contador = 1;//Inicialización
        char respuesta;
        do{
            System.out.println("Contador: " + contador);
            contador ++;//Incremento
            System.out.println("Quieres continuar?(Escribe S para continuar, o N para detenerse) ");
            respuesta = scanner.next().charAt(0);
        }while(respuesta !='n');
        System.out.println("Hasta pronto...");
     }
}

//Codigo finalizado.
//Codigo compilado con exito.