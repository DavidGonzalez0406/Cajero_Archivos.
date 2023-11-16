import java.util.Scanner;

public class CajeroAutomáticoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su NIP de 4 dígitos: ");
        String nip = scanner.nextLine();

        if (nombre.equalsIgnoreCase("admin") && nip.equals("3243")) {
            // Modo Administrador
            Administrador admin = new Administrador();
            admin.realizarAccionAdministrador();
        } else {
            // Modo Cajero
            Usuario usuario = new Usuario(nombre, nip);
            CajeroAutomático cajero = new CajeroAutomático("billetes.dat");

            System.out.println("Bienvenido, " + usuario.getNombre() + " al modo cajero.");

            while (true) {
                System.out.println("\nAcciones disponibles:");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Retirar efectivo");
                System.out.println("3. Salir");

                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        cajero.consultarSaldo(usuario);
                        Logger.log("consultar", usuario, usuario.getSaldo(), true);
                        break;
                    case 2:
                        System.out.print("Ingrese la cantidad a retirar: ");
                        int cantidad = scanner.nextInt();
                        boolean retiroExitoso = cajero.retirarEfectivo(usuario, cantidad);
                        Logger.log("retirar", usuario, retiroExitoso ? usuario.getSaldo() : 0, retiroExitoso);
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        }
    }
}
