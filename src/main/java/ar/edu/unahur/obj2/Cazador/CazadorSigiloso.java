package ar.edu.unahur.obj2.Cazador;

import ar.edu.unahur.obj2.Profugo.Profugo;

public class CazadorSigiloso extends Cazador {
    
    public CazadorSigiloso(Integer experiencia) {
        super(experiencia);
    }

    @Override
    public Boolean puedeCapturar(Profugo profugo) {
        return profugo.getHabilidad() < 50;
    }

    @Override
    public void intimidar(Profugo profugo) {
        profugo.disminuirHabilidad(5);
    }
}
