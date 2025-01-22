import java.security.SecureRandom;

public class Gimnasio {
    private String nombre;
    private String[] actividades = {"Yoga", "Boxeo", "Funcional"};
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
    private static final int LONGITUD_CONTRASENA = 12;

    public Gimnasio(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarActividades() {
        System.out.println("Actividades disponibles en el gimnasio " + nombre + ":");
        for (String actividad : actividades) {
            System.out.println("- " + actividad);
        }
    }

    public void registrarUsuario(String usuario) {
        System.out.println("Usuario " + usuario + " registrado en el gimnasio " + nombre + ".");
    }

    //se añade una función que genera uan contraseña al usurio recién registrado
    public static String generarContrasena() {
        SecureRandom random = new SecureRandom();
        StringBuilder contrasena = new StringBuilder(LONGITUD_CONTRASENA);
        for (int i = 0; i < LONGITUD_CONTRASENA; i++) {
            int indice = random.nextInt(CARACTERES.length());
            contrasena.append(CARACTERES.charAt(indice));
        }
        return contrasena.toString();
    }

    public static void main(String[] args) {
        Gimnasio miGimnasio = new Gimnasio("FitLife Gym");
        miGimnasio.mostrarActividades();
        miGimnasio.registrarUsuario("Juan Perez");

        String contrasena = generarContrasena();
        System.out.println("Contraseña generada para Juan Perez: " + contrasena);
    }
}
