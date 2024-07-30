package conductores;

public class Conductor {
    private String nombre;
    private String licencia;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void mostrarinformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Licencia: " + licencia);
    }

}
