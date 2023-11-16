
import java.io.*;
import java.util.*;

class Usuario {
    private String nombre;
    private String nip;
    private int saldo;

    public Usuario(String nombre, String nip) {
        this.nombre = nombre;
        this.nip = nip;
        this.saldo = new Random().nextInt(49001) + 1000;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNip() {
        return nip;
    }

    public int getSaldo() {
        return saldo;
    }
}
