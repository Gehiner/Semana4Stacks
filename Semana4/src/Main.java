import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bodega bodega = new Bodega(3, 2); // N = 3, X = 2
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ingresar contenedor");
            System.out.println("2. Retirar contenedor");
            System.out.println("3. Mostrar bodega");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("ID del contenedor: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // limpiar buffer
                    System.out.print("Nombre del producto: ");
                    String producto = sc.nextLine();
                    bodega.ingresarContenedor(new Contenedor(id, producto));
                    break;

                case 2:
                    System.out.print("ID del contenedor a retirar: ");
                    int idRetiro = sc.nextInt();
                    bodega.retirarContenedor(idRetiro);
                    break;

                case 3:
                    bodega.mostrarBodega();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
