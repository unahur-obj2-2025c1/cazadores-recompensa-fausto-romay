package ar.edu.unahur.obj2.Agencia;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unahur.obj2.Profugo.Profugo;

public class Zona {
    private String nombre;
    private List<Profugo> profugos = new ArrayList<Profugo>();

    public Zona(String nombre) {
        this.nombre = nombre;
    }

    public List<Profugo> getProfugos() {
        return profugos;
    }

    public String getNombre() {
        return nombre;
    }
}
