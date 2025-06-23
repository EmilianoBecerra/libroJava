import java.util.Scanner;

public class CalculadoraBMI {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            double peso;
            double altura;
            double resultado;

            System.out.print("Ingrese su peso en Kilogramos: ");
            peso = entrada.nextDouble();

            System.out.print("Ingrese su altura en metros: ");
            altura = entrada.nextDouble();

            resultado = peso / (altura * altura);        

            System.out.printf("La masa corporal para el peso: %.2f kg y la altura: %.2f metros es de: %.2f \n", peso, altura, resultado);
            System.out.println("Bajo peso: menos de 18.5");
            System.out.println("Normal: 18.6 y 24.9");
            System.out.println("Sobrepeso: 25 y 29.9");
            System.out.println("Obeso: 30 o mas");
        }


    }
}