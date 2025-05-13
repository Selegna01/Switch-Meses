import java.util.Scanner;

public class meses{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número del 1 al 12: ");
        int numeroMes = scanner.nextInt();

        String nombreMes;

        switch(numeroMes){
            case 1:
                nombreMes = "Enero";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 2:
                nombreMes = "Febrero";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 3:
                nombreMes = "Marzo";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 4:
                nombreMes = "Abril";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 5:
                nombreMes = "Mayo";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 6:
                nombreMes = "Junio";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 7:
                nombreMes = "Julio";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 8:
                nombreMes = "Agosto";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 9:
                nombreMes = "Septiembre";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 10:
                nombreMes = "Enero";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 11:
                nombreMes = "Octubre";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 12:
                nombreMes = "Noviembre";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
                default:;
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
        }
    }
}