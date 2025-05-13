package ar.edu.unahur.obj2.Cazador;

import ar.edu.unahur.obj2.Profugo.Profugo;

public class CazadorRural extends Cazador {
    
    public CazadorRural(Integer experiencia) {
        super(experiencia);
    }

    @Override
    public Boolean puedeCapturar(Profugo profugo) {
        return profugo.getEsNervioso();
    }

    @Override
    public void intimidar(Profugo profugo) {
        profugo.volverNervioso();
    }
}
