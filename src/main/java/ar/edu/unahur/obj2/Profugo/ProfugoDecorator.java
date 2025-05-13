package ar.edu.unahur.obj2.Profugo;

public abstract class ProfugoDecorator implements Profugo {
    private Profugo decorado;

    public ProfugoDecorator(Profugo profugo) {
        this.decorado = profugo;
    }

    public Profugo getProfugoDecorado() {
        return decorado;
    }

    @Override
    public Integer getInocencia() {
        return decorado.getInocencia();
    }

    @Override
    public Integer getHabilidad() {
        return decorado.getHabilidad();
    }

    @Override
    public Boolean getEsNervioso() {
        return decorado.getEsNervioso();
    }

    @Override
    public void volverNervioso() {
        decorado.volverNervioso();
    }

    @Override
    public void volverTranquilo() {
        decorado.volverTranquilo();
    }

    @Override
    public void disminuirHabilidad(Integer valor) {
        decorado.disminuirHabilidad(valor);
    }

    @Override
    public void disminuirInocencia(Integer valor) {
        decorado.disminuirInocencia(valor);
    }
}
