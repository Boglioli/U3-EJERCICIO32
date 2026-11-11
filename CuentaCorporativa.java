public class CuentaCorporativa extends CuentaSocial {
    private int limiteAdministradores;
    private String sitioWeb;
public CuentaCorporativa(String username, String email, int seguidores, int limiteAdministradores, String sitioWeb) {
    super(username, email, seguidores);
    this.limiteAdministradores = limiteAdministradores;
    this.sitioWeb = sitioWeb;
}
@Override
    public double calcularAlcance() {
    return seguidores * 1.2;
}
public void mostrarDatos() {
    super.mostrarDatos();
    System.out.println("limite de administradores: " + limiteAdministradores);
    System.out.println("sitio web: " + sitioWeb);
}
}
