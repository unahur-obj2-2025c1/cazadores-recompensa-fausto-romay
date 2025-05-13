package ar.edu.unahur.obj2.Agencia;

import ar.edu.unahur.obj2.Cazador.Cazador;
import ar.edu.unahur.obj2.Profugo.Profugo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Agencia {
    private List<Cazador> cazadores = new ArrayList<Cazador>();
    public Agencia() {}

    public List<Cazador> getCazadores() {
        return cazadores;
    }

    public void agregarCazador(Cazador cazador) {
        cazadores.add(cazador);
    }

    public List<Profugo> getProfugosCapturados() {
    return cazadores.stream()
        .flatMap(c -> c.getProfugosCapturados().stream())
        .collect(Collectors.toList());
    }

    public Profugo getProfugoMasHabil() {
        return this.getProfugosCapturados().stream().max(Comparator.comparingInt(Profugo::getHabilidad)).orElse(null);
    }

    public Cazador getCazadorConMasCapturados() {
        return cazadores.stream().max(Comparator.comparingInt(c -> c.getProfugosCapturados().size())).orElse(null);
    }
}
