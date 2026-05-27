public class MacFactory implements GUIFactory{
    @Override
    public BotonMac crearBoton() {
        return new BotonMac();
    };
    @Override
    public VentanaMac crearVentana() {
        return new VentanaMac();
    }
}
