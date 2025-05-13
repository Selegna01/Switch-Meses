import java.util.Scanner;

public class meses{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número del 1 al 12: ");
        int numeroMes = scanner.nextInt();

        String nombreMes;

        switch(numeroMes){
            case 1:
                nombreMes = "January";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 2:
                nombreMes = "Febraury";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 3:
                nombreMes = "March";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 4:
                nombreMes = "April";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 5:
                nombreMes = "May";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 6:
                nombreMes = "June";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 7:
                nombreMes = "Jule";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 8:
                nombreMes = "August";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 9:
                nombreMes = "September";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 10:
                nombreMes = "October";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 11:
                nombreMes = "November";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
            case 12:
                nombreMes = "December";
                System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
                break;
                default:;
                System.out.println("EROR.Ingresa un numero valido.");
        }
    }
}