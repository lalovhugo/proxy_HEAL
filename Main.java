package Proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Application started.");
        // La imagen se carga inmediatamente, aunque no la mostremos aún.
        // Usando Proxy - la carga NO ocurre inmediatamente
        Image image = new ProxyImage("photo.jpg");
        System.out.println("Proxy created, but RealImage not loaded yet.\n");
        
        // La carga ocurre aquí, en la primera llamada a display()
        System.out.println("--- First call ---");
        image.display();
        
        // Segunda llamada - el objeto ya existe, no se vuelve a cargar del disco
        System.out.println("\n--- Second call ---");
        image.display();
    }
}