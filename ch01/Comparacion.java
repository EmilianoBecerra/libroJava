import java.util.Scanner;

public class Comparacion {
    public static void main(String[] args ) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;

        System.out.print("Escriba el primer entero: ");
        numero1 = entrada.nextInt();

        System.out.print("Escriba el segundo entero: ");
        numero2 = entrada.nextInt();

        if(numero1 == numero2) {
            System.out.printf("%d es igual a %d\n", numero1, numero2);
        }

        if(numero1 != numero2) {
            System.out.printf("%d es diferente a %d\n", numero1, numero2);
        }

        if(numero1 < numero2) {
            System.out.printf("%d es menor a %d\n", numero1, numero2);
        }

        if(numero1 > numero2) {
            System.out.printf("%d es mayor a %d\n", numero1, numero2);
        }

        if(numero1 >= numero2) {
            System.out.printf("%d es mayor o igual a %d\n", numero1, numero2);
        }

        if(numero1 <= numero2) {
            System.out.printf("%d es menor o igual a %d", numero1, numero2);
        }
    }
}