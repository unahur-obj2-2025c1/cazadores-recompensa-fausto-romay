package ar.edu.unahur.obj2.Agencia;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import ar.edu.unahur.obj2.Cazador.Cazador;
import ar.edu.unahur.obj2.Profugo.Profugo;

public class Agencia {
    private List<Cazador> cazadores = new ArrayList<Cazador>();
    public Agencia() {}

    public void contratarCazador(Cazador cazador) {
        cazadores.add(cazador);
    }

    public List<Cazador> getCazadores() {
        return cazadores;
    }

    public List<Profugo> getProfugosCapturados() {
        return cazadores.stream().flatMap(c -> c.getCapturados().stream()).collect(Collectors.toList());
    }

    public OptionalInt getProfuboMasHabil() {
        return this.getProfugosCapturados().stream().mapToInt(p -> p.getHabilidad()).max();
    }
}
