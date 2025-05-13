package ar.edu.unahur.obj2.Profugo;

public class ProfugoConEntrenamiento extends ProfugoDecorator {
    
    public ProfugoConEntrenamiento(Profugo profugo) {
        super(profugo);
    }

    @Override
    public Boolean getEsNervioso() {
        return false;
    }
}
