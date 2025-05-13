package ar.edu.unahur.obj2.Profugo;

public class ProfugoConProteccionLegal extends ProfugoDecorator {
    
    public ProfugoConProteccionLegal(Profugo profugo) {
        super(profugo);
    }

    @Override
    public Integer getInocencia() {
        return Math.max(40, this.getInocencia());
    }
}
