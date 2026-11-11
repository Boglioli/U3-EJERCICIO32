public class Main {
    public static void main(String[] args) {
        CuentaCreador creador = new CuentaCreador("martin-creador", "martin@gmail.com", 1000, 120000, 2500);
        CuentaCorporativa empresa = new CuentaCorporativa("empresa-oficial", "empresa@gmail.com", 12000, 5, "www.empresa.com");
        creador.publicarContenido();
        creador.seguirUsuario();
        empresa.publicarContenido();
        empresa.seguirUsuario();
        System.out.println("\n---- cuenta creador ----");
        creador.mostrarDatos();
        System.out.println("\n---- cuenta corporativa ----");
        creador.mostrarDatos();

    }
}
