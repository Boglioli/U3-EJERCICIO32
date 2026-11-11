public class CuentaSocial {
    protected String username;
    protected String email;
    protected int seguidores;
    public CuentaSocial(String username, String email, int seguidores) {
        this.username = username;
        this.email = email;
        this.seguidores = seguidores;
    }
    public void publicarContenido() {
        System.out.println(username + "publico nuevo contenido");
    }
    public void seguirUsuario() {
        seguidores++;
    }
    public void calcularAlcance() {
        return seguidores * 0.5;
    }
    public void mostrarDatos() {
System.out.println("usuario: " + username);
System.out.println("email: " + email);
System.out.println("seguidores: " + seguidores);
System.out.println("alcance: " + calcularAlcance());

    }

}

