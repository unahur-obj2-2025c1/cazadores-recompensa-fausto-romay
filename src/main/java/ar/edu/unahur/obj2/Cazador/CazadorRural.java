package ar.edu.unahur.obj2.Cazador;

import ar.edu.unahur.obj2.Agencia.Zona;
import ar.edu.unahur.obj2.Profugo.Profugo;

public class CazadorRural extends CazadorDecorator {
    public CazadorRural(Cazador cazador) {
        super(cazador);
    }

    @Override
    public Integer getExperiencia() {
        return this.getExperiencia();
    }
    
    @Override
    public void sumarExperiencia(Integer valor) {
        this.sumarExperiencia(valor);
    }

    @Override 
    public Boolean puedeCapturar(Profugo profugo) {
        return profugo.esNervioso();
    }

    @Override
    public void capturarProfugo(Zona zona, Profugo profugo) {
        super.capturarProfugo(zona, profugo);
    }

    @Override
    public void intimidar(Profugo profugo) {
        profugo.setEsNervioso(true);
    }

    @Override
    public void capturarEnZona(Zona zona) {
        super.capturarEnZona(zona);
    }

}
