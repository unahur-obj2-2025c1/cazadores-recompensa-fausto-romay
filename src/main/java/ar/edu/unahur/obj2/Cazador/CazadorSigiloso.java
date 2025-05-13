package ar.edu.unahur.obj2.Cazador;

import ar.edu.unahur.obj2.Agencia.Zona;
import ar.edu.unahur.obj2.Profugo.Profugo;

public class CazadorSigiloso extends CazadorDecorator {
    
    public CazadorSigiloso(Cazador cazador) {
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
        return profugo.getHabilidad() < 50;
    }

    @Override
    public void capturarProfugo(Zona zona, Profugo profugo) {
        super.capturarProfugo(zona, profugo);
    }

    @Override
    public void intimidar(Profugo profugo) {
        Integer nuevaHabilidad = Math.max(0, profugo.getHabilidad() - 5);
        profugo.setHabilidad(nuevaHabilidad);
    }

}
