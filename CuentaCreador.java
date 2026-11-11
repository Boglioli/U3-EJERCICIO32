public class CuentaCreador extends CuentaSocial {
    private double ingresosPublicidad;
    private int visualizaciones;
    public CuentaCreador(String usarname, String email, int seguidores, double ingresosPublicidad, int visualizaciones) {
        super(usarname, email, seguidores);
        this.ingresosPublicidad = ingresosPublicidad;
        this.visualizaciones = visualizaciones;
    }
    @Override
    public double calcularAlcance() {
        return visualizaciones * 0.8;
    }
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ingresos por publicidad: $" + ingresosPublicidad);
        System.out.println("visualizaciones: " + visualizaciones);
    }
}
