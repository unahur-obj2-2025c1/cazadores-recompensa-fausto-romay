package ar.edu.unahur.obj2.Profugo;

public class EntrenamientoDeElite implements Entrenamiento {
    public EntrenamientoDeElite() {}

    @Override
    public void entrenar(Profugo profugo) {
        profugo.setEsNervioso(false);
    }
}
