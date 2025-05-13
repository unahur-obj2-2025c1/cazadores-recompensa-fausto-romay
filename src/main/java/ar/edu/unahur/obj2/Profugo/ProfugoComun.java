package ar.edu.unahur.obj2.Profugo;

public class ProfugoComun implements Profugo {
    private Integer nivelDeInocencia;
    private Integer nivelDeHabilidad;
    private Boolean esNervioso;

    public ProfugoComun(Integer inocencia, Integer habilidad, Boolean esNervioso) {
        this.nivelDeHabilidad = habilidad;
        this.nivelDeInocencia = inocencia;
        this.esNervioso = esNervioso;
    }

    @Override
    public Integer getInocencia() {
        return nivelDeInocencia;
    }

    @Override
    public Integer getHabilidad() {
        return nivelDeHabilidad;
    }

    @Override
    public Boolean getEsNervioso() {
        return esNervioso;
    }

    @Override
    public void volverNervioso() {
        esNervioso = true;
    }

    @Override
    public void volverTranquilo() {
        esNervioso = false;
    }

    @Override
    public void disminuirHabilidad(Integer valor) {
        nivelDeHabilidad -= valor;
    }

    @Override
    public void disminuirInocencia(Integer valor) {
        nivelDeInocencia -= valor;
    }
}
