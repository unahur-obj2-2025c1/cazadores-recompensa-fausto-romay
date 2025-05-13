package ar.edu.unahur.obj2.Cazador;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

import ar.edu.unahur.obj2.Agencia.Zona;
import ar.edu.unahur.obj2.Profugo.Profugo;

public class Cazador {
    private List<Profugo> profugosCapturados = new ArrayList<Profugo>();
    private List<Profugo> profugosIntimidados = new ArrayList<Profugo>();
    private Integer cantProfugosCapturados = profugosCapturados.size();
    private Integer experiencia;

    public Cazador(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public void aumentarExperiencia() {
        experiencia += this.minimaHabilidadDeIntimidados() + (cantProfugosCapturados * 2);
    }

    public Integer minimaHabilidadDeIntimidados() {
        return this.getProfugosInitmidados().stream().mapToInt(p -> p.getHabilidad()).min().orElse(0);
    }

    public List<Profugo> getProfugosInitmidados() {
        return profugosIntimidados;
    }

    public List<Profugo> getProfugosCapturados() {
        return profugosCapturados;
    }

    public Integer getCantProfugosCapturados() {
        return cantProfugosCapturados;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void capturarProfugosDeZona(Zona zona) {
        zona.getProfugos().stream().forEach(p -> this.capturarProfugo(p, zona));
    }

    public void capturarProfugo(Profugo profugo, Zona zona) {
        if (this.puedeCapturar(profugo)) {
            zona.getProfugos().remove(profugo);
            profugosCapturados.add(profugo);
        } else {
            this.intimidar(profugo);
        }
    }

    public Boolean puedeCapturar(Profugo profugo) {
        return this.getExperiencia() > profugo.getInocencia();
    }

    public void intimidar(Profugo profugo) {
        profugo.disminuirInocencia(2);
        profugosIntimidados.add(profugo);
    }
}
