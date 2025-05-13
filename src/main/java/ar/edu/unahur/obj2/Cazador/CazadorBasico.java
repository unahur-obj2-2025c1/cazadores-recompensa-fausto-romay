package ar.edu.unahur.obj2.Cazador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ar.edu.unahur.obj2.Agencia.Zona;
import ar.edu.unahur.obj2.Profugo.Profugo;

public class CazadorBasico implements Cazador {
    private Integer experiencia;
    private List<Profugo> capturados = new ArrayList<Profugo>();

    public CazadorBasico(Integer experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public List<Profugo> getCapturados() {
        return capturados;
    }

    @Override 
    public void agregarCapturado(Profugo profugo) {
        capturados.add(profugo);
    }

    @Override
    public void sumarExperiencia(Integer valor) {
        experiencia += valor;
    }

    @Override
    public Integer getExperiencia() {
        return experiencia;
    }

    @Override
    public Boolean puedeCapturar(Profugo profugo) {
        return this.getExperiencia() > profugo.getInocencia();
    }

    @Override
    public void capturarProfugo(Zona zona, Profugo profugo) {
        if (this.puedeCapturar(profugo)) {
            zona.getProfugos().remove(profugo);
            capturados.add(profugo);
        } else {
            this.intimidar(profugo);
        }
    }

    @Override
    public void intimidar(Profugo profugo) {
        Integer nuevaInocencia = Math.max(0, profugo.getInocencia() - 2);
        profugo.setInocencia(nuevaInocencia);
    }

    @Override
    public void capturarEnZona(Zona zona) {
        List<Integer> habilidadDeIntimidados = new ArrayList<Integer>();
        Integer cantCapturados = 0;

        for (Profugo profugo : zona.getProfugos()) {
            if (this.puedeCapturar(profugo)) {
                zona.getProfugos().remove(profugo);
                capturados.add(profugo);
                cantCapturados += 1;
            } else {
                habilidadDeIntimidados.add(profugo.getHabilidad());
            }
        }

        Integer minHabilidad = habilidadDeIntimidados.stream().min(Comparator.naturalOrder()).orElse(0);
        this.sumarExperiencia(minHabilidad + (cantCapturados * 2));
    }
}
