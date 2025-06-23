import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
       try (Scanner entrada = new Scanner(System.in)) {
        int numero1;
           int numero2;
           int suma;

           System.out.print("Ingrese el primer numero: ");
           numero1 = entrada.nextInt();

           System.out.print("Ingrese el segundo numero: ");
           numero2 = entrada.nextInt();

           suma = numero1 + numero2;

           System.out.printf("La suma entre %d y %d es: %d", numero1, numero2, suma);
       }
    }
}