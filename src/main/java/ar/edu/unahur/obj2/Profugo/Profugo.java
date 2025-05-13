package ar.edu.unahur.obj2.Profugo;

public class Profugo {
    private Integer nivelDeInocencia;
    private Integer nivelDeHabilidad;
    private Boolean esNervioso;

    public Profugo(Integer nivelDeInocencia, Integer nivelDeHabilidad, Boolean esNervioso) {
        this.nivelDeHabilidad = nivelDeHabilidad;
        this.nivelDeInocencia = nivelDeInocencia;
        this.esNervioso = esNervioso;
    }

    public void entrenarse(Entrenamiento entrenamiento) {
        entrenamiento.entrenar(this);
    }

    public Integer getInocencia() {
        return nivelDeInocencia;
    }

    public Integer getHabilidad() {
        return nivelDeHabilidad;
    }

    public Boolean esNervioso() {
        return esNervioso;
    }

    public void setInocencia(Integer nuevoValor) {
        nivelDeInocencia = nuevoValor;
    }

    public void setEsNervioso(Boolean bool) {
        esNervioso = true;
    }

    public void setHabilidad(Integer nuevoValor) {
        nivelDeHabilidad = nuevoValor;
    }
}
