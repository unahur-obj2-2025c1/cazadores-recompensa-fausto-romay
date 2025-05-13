package ar.edu.unahur.obj2.Profugo;

public class ProfugoConArtesMarciales extends ProfugoDecorator {
    
    public ProfugoConArtesMarciales(Profugo profugo) {
        super(profugo);
    }

    @Override
    public Integer getHabilidad() {
        return Math.min(this.getHabilidad() * 2, 100);
    }
}
