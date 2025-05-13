package ar.edu.unahur.obj2.Profugo;

public class ArtesMarciales implements Entrenamiento {
    public ArtesMarciales() {}
    
    @Override 
    public void entrenar(Profugo profugo) {
        profugo.setHabilidad(profugo.getHabilidad() * 2);
    }
}
