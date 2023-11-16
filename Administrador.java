class Administrador {
    private static final String LOG_FILE = "logs.txt";
    private static final String BILLETES_FILE = "billetes.dat";

    public void menuAdministrador() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nAcciones disponibles como Administrador:");
            System.out.println("1. Mostrar listado de acciones en el log");
            System.out.println("2. Mostrar cantidad de billetes restantes");
            System.out.println("3. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarLog();
                    break;
                case 2:
                    mostrarCantidadBilletes();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
