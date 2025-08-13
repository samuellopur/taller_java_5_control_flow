import java.util.Scanner;

public class SupermercadoDescuento {

    public static void realizarFactura() {
        Scanner scanner = new Scanner(System.in);

        // Solicita total de la compra
        System.out.print("Ingrese el total de la compra: ");
        double totalCompra = scanner.nextDouble();

        // Solicita número de productos comprados
        System.out.print("¿Cuántos productos compró?: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine();

        // Preguntar si tiene membresía
        System.out.print("¿Tiene membresía? (sí/no): ");
        String tieneMembresia = scanner.nextLine().toLowerCase();

        double descuento = 0.0;

        // Aplica 10% de descuento por membresía
        if (tieneMembresia.equals("si")) {
            descuento += 0.10;
        }

        // Aplica 5% de descuento adicional por mas de 10 productos
        if (cantidadProductos > 10) {
            descuento += 0.05; // 5%
        }

        // Calcula total el total con descuento
        double valorDescuento = totalCompra * descuento;
        double totalAPagar = totalCompra - valorDescuento;

        // Mostrar resultado
        System.out.printf("""
                
                ****************************
                +++++ Ticket de compra +++++
                ****************************
                Total sin descuento: $%.2f
                Descuento aplicado: %.0f%%
                Valor descuento: $%.2f
                Total a pagar con descuento: $%.2f
                """, totalCompra, descuento * 100, valorDescuento, totalAPagar);

        scanner.close();
    }
}
