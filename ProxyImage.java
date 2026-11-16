public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;
    
    public ProxyImage(String filename) {
        this.filename = filename;
    }
    
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename); // Carga solo cuando es necesario (Lazy Loading)
        }
        realImage.display(); // Delega la acción al objeto real
    }
}