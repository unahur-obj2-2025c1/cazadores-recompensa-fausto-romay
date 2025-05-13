package ar.edu.unahur.obj2.Profugo;

public class ProteccionLegal implements Entrenamiento {
    public ProteccionLegal() {}

    @Override
    public void entrenar(Profugo profugo) {
        profugo.setInocencia(profugo.getInocencia() + 40);
    }
}
