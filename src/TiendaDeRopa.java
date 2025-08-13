import java.util.Scanner;

public class TiendaDeRopa {

    public static void mostrarPrecios() {
        Scanner scanner = new Scanner(System.in);

        // Se solicita tipo de prenda
        System.out.print("Ingrese el tipo de prenda (camisa, pantalón, chaqueta): ");
        String tipoPrenda = scanner.nextLine().toLowerCase();

        // Se solicita cantidad
        System.out.print("Ingrese la cantidad de prendas: ");
        int cantidad = scanner.nextInt();

        double precioUnitario = 0;
        double descuento = 0;
        double totalSinDescuento = 0;
        double totalFinal = 0;

        // Se asigna precio según la prenda
        switch (tipoPrenda) {
            case "camisa":
                precioUnitario = 25000;
                break;
            case "pantalón":
                precioUnitario = 40000;
                break;
            case "chaqueta":
                precioUnitario = 60000;
                break;
            default:
                System.out.println("Tipo de prenda no válido.");
                scanner.close();
                return;
        }

        // Se calcula total sin descuento
        totalSinDescuento = precioUnitario * cantidad;

        // Se aplica descuento si corresponde
        if (cantidad > 5) {
            descuento = totalSinDescuento * 0.15;
        }

        totalFinal = totalSinDescuento - descuento;

        // Se muestra resultado
        System.out.println("\n--- Detalle de la compra ---");
        System.out.println("Prenda: " + tipoPrenda);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        if (descuento > 0) {
            System.out.println("Descuento aplicado (15%): $" + descuento);
        }
        System.out.println("Total a pagar: $" + totalFinal);

        scanner.close();
    }
}