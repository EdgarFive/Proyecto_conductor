package conductores;

public class CondutorDeCoche extends Conductor {

    private int experienciaanios;

    public CondutorDeCoche(String nombre, String licencia, int experienciaanios) {
        super(nombre, licencia);
        this.experienciaanios = experienciaanios;
    }

    @Override
    public void mostrarinformacion(){
        super.mostrarinformacion();
        System.out.println("Años de experiencia: " +experienciaanios);
    }
}
