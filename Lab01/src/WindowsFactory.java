public class WindowsFactory implements GUIFactory {
    @Override
    public BotonWindows crearBoton() {
        return new BotonWindows();
    };
    @Override
    public VentanaWindows crearVentana() {
        return new VentanaWindows();
    }
}
