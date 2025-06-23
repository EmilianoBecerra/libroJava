import java.util.Scanner;

public class CostoViajeCompartido {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            double totalKM;
            double costoLTNafta;
            double promedioLTxKM;
            double cuotaEstacionamiento;
            double peajePorDia;
            int cantidadDePersonas;
            double costoTotal;
            double ahorro;
            double gastoNafta;

            System.out.print("Ingrese los kilometros totales a realizar: ");
            totalKM = entrada.nextDouble();

            System.out.print("Ingrese el precio del litro de nafta: ");
            costoLTNafta = entrada.nextDouble();

            System.out.print("Ingrese el gasto promedio de litros de nafta por kilometro de su auto: ");
            promedioLTxKM = entrada.nextDouble();

            System.out.print("Ingrese el costo del estacionamiento total del dia: ");
            cuotaEstacionamiento = entrada.nextDouble();

            System.out.print("Ingrese el costo de los peajes por dia: ");
            peajePorDia = entrada.nextDouble();

            System.out.print("Ingrese la cantidad de personas con las que puede compartir el viaje: ");
            cantidadDePersonas = entrada.nextInt();

            gastoNafta = (totalKM * promedioLTxKM) * costoLTNafta;

            costoTotal = (gastoNafta + cuotaEstacionamiento + peajePorDia);

            if(cantidadDePersonas == 1) {
                System.out.printf("El costo total para vos solo es de %.2f pesos", costoTotal);
            }

            if (cantidadDePersonas == 2) {
                ahorro = (costoTotal / cantidadDePersonas);
                System.out.printf("Puede ahorrar %.2f pesos compartiendo el viaje con %d personas.", ahorro,
                        cantidadDePersonas);
            }
            if (cantidadDePersonas > 2) {
                ahorro = (costoTotal / cantidadDePersonas) * (cantidadDePersonas - 1);
                System.out.printf("Puede ahorrar %.2f pesos compartiendo el viaje con %d personas.", ahorro,
                        cantidadDePersonas);
            }
        }

    }
}
