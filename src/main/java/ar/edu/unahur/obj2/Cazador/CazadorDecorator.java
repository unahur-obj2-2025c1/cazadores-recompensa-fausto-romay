package ar.edu.unahur.obj2.Cazador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ar.edu.unahur.obj2.Agencia.Zona;
import ar.edu.unahur.obj2.Profugo.Profugo;

public abstract class CazadorDecorator implements Cazador {
    private Cazador cazador;

    public CazadorDecorator(Cazador cazador) {
        this.cazador = cazador;
    }

    @Override
    public List<Profugo> getCapturados() {
        return cazador.getCapturados();
    }

    @Override 
    public void agregarCapturado(Profugo profugo) {
        cazador.agregarCapturado(profugo);
    }

    @Override
    public Integer getExperiencia() {
        return cazador.getExperiencia();
    }

    @Override
    public void capturarProfugo(Zona zona, Profugo profugo) {
        if (this.puedeCapturar(profugo)) {
            zona.getProfugos().remove(profugo);
            cazador.agregarCapturado(profugo);
        } else {
            this.intimidar(profugo);
        }
    }

    @Override
    public void capturarEnZona(Zona zona) {
        List<Integer> habilidadDeIntimidados = new ArrayList<Integer>();
        Integer cantCapturados = 0;

        for (Profugo profugo : zona.getProfugos()) {
            if (this.puedeCapturar(profugo)) {
                zona.getProfugos().remove(profugo);
                cazador.agregarCapturado(profugo);
                cantCapturados += 1;
            } else {
                habilidadDeIntimidados.add(profugo.getHabilidad());
            }
        }

        Integer minHabilidad = habilidadDeIntimidados.stream().min(Comparator.naturalOrder()).orElse(0);
        cazador.sumarExperiencia(minHabilidad + (cantCapturados * 2));
    }
}
