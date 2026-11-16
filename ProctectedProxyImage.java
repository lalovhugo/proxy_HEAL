// Este archivo es opcional, solo lo puse para agregar más funcinalidades
public class ProtectedProxyImage implements Image {
    private RealImage realImage;
    private String filename;
    private String userRole;

    public ProtectedProxyImage(String filename, String userRole) {
        this.filename = filename;
        this.userRole = userRole;
    }

    @Override
    public void display() {
        if (!"ADMIN".equals(userRole)) {
            System.out.println("Acceso denegado: No tienes permisos para ver esta imagen.");
            return;
        }
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}