import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Logger {
    private static final String LOG_FILE = "logs.txt";

    public static void log(String accion, Usuario usuario, int saldo, boolean seRealizo) {
        try {
            FileWriter fileWriter = new FileWriter(LOG_FILE, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("accion: " + accion + ", usuario: " + usuario.getNombre() +
                    ", saldo: " + saldo + ", seRealizo: " + (seRealizo ? "SI" : "NO"));

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
