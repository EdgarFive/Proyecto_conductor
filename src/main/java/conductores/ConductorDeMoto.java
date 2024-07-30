package conductores;

public class ConductorDeMoto extends Conductor {

    private boolean tienelicenciamoto;

    public ConductorDeMoto(String nombre, String licencia, boolean tienelicenciamoto) {
        super(nombre, licencia);
        this.tienelicenciamoto = tienelicenciamoto;
    }

    @Override
    public void mostrarinformacion(){
        super.mostrarinformacion();
        System.out.println("Licencia de moto: " + tienelicenciamoto);
    }

}
