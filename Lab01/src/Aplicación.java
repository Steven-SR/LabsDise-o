public class Aplicación {
    private GUIFactory factory;
    private Botón button;
    private Ventana window;
    public Aplicación (GUIFactory factory){
        this.factory = factory;
        this.button = factory.crearBoton();
        this.window = factory.crearVentana();
    }
    public void showBoton() {
        button.mostrarBoton();
    }
    public void showVentana() {
        window.mostrarVentana();
    }
}
