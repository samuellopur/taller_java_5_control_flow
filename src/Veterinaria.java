import java.util.Scanner;

public class Veterinaria {

   public static void clasificarMascota() {
        Scanner scanner = new Scanner(System.in);

        // Solicita el animal
        System.out.print("Ingrese el tipo de animal (perro, gato, ave, otro): ");
        String tipoAnimal = scanner.nextLine().toLowerCase();

        String veterinario = "";
        boolean vacunacionAdicional = false;
        int edad = 0;

        // Si es perro o gato, se solicita la edad
        if (tipoAnimal.equals("perro") || tipoAnimal.equals("gato")) {
            System.out.print("Ingrese la edad del animal en años: ");
            edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
        }

        // Asignar veterinario según el tipo de animal
        switch (tipoAnimal) {
            case "perro":
                veterinario = "Dr. Sanchez (especialista en perros)";
                if (edad > 5) {
                    vacunacionAdicional = true;
                }
                break;

            case "gato":
                veterinario = "Dra. Mendoza (especialista en gatos)";
                if (edad > 5) {
                    vacunacionAdicional = true;
                }
                break;

            case "ave":
                veterinario = "Dr. Malavera (especialista en aves)";
                break;

            default:
                veterinario = "Dra. Muñoz (especialista en otros animales)";
        }

        // Mostrar resultados
       System.out.printf("""
                    **************************************
                    +++++ Información de la consulta +++++
                    **************************************
                    "Veterinario asignado: %s
                    """, veterinario);

        if (tipoAnimal.equals("perro") || tipoAnimal.equals("gato")) {
            if (vacunacionAdicional) {
                System.out.println("Se recomienda vacunación adicional la mascota tiene mas de 5 años.");
            } else {
                System.out.println("Aún no requiere vacunación.");
            }
        }

        scanner.close();
    }
}

