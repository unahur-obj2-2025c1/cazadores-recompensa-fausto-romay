package ar.edu.unahur.obj2.Cazador;

import java.util.List;

import ar.edu.unahur.obj2.Agencia.Zona;
import ar.edu.unahur.obj2.Profugo.Profugo;

public interface Cazador {
    Boolean puedeCapturar(Profugo profugo);
    void capturarProfugo(Zona zona, Profugo profugo);
    void intimidar(Profugo profugo);
    void capturarEnZona(Zona zona);
    Integer getExperiencia();
    List<Profugo> getCapturados();
    void sumarExperiencia(Integer valor);
    void agregarCapturado(Profugo profugo);
}
