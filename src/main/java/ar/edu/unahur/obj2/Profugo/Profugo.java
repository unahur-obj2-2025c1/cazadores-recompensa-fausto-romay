package ar.edu.unahur.obj2.Profugo;

public interface Profugo {
    Integer getInocencia();
    Integer getHabilidad();
    Boolean getEsNervioso();

    void volverNervioso();
    void volverTranquilo();
    void disminuirHabilidad(Integer valor);
    void disminuirInocencia(Integer valor);
}
