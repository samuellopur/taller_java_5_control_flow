import java.util.Scanner;

public class Parqueadero {

    public static void controlarAcceso() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar tipo de vehículo
        System.out.print("Ingrese el tipo de vehículo (auto, moto, bicicleta): ");
        String tipoVehiculo = scanner.nextLine().toLowerCase();

        // Solicitar hora de llegada
        System.out.print("Ingrese la hora de llegada (formato 24 horas): ");
        int horaLlegada = scanner.nextInt();

        double tarifaBase = 0;
        double recargo = 0;
        double costoTotal = 0;

        // Asignar tarifa base según el tipo de vehículo
        switch (tipoVehiculo) {
            case "auto":
                tarifaBase = 5000;
                break;
            case "moto":
                tarifaBase = 3000;
                break;
            case "bicicleta":
                tarifaBase = 1000;
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
                scanner.close();
                return;
        }

        // Verificar si aplica recargo
        if (horaLlegada > 20) {
            recargo = tarifaBase * 0.20;
        }

        costoTotal = tarifaBase + recargo;

        // Mostrar resultado
        System.out.println("\n--- Detalle del Parqueo ---");
        System.out.println("Vehículo: " + tipoVehiculo);
        System.out.println("Hora de llegada: " + horaLlegada + ":00");
        System.out.println("Tarifa base: $" + tarifaBase);
        if (recargo > 0) {
            System.out.println("Recargo nocturno (20%): $" + recargo);
        }
        System.out.println("Costo total: $" + costoTotal);

        scanner.close();
    }
}