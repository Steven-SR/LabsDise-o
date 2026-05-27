public class Main {
    public static void main(String[] args) {
        System.out.println("Aplicación de Windows: ");
        WindowsFactory wf = new WindowsFactory();
        Aplicación winApp = new Aplicación(wf);
        winApp.showBoton();
        winApp.showVentana();
        System.out.println("Aplicación de Mac: ");
        MacFactory mf = new MacFactory();
        Aplicación macApp = new Aplicación(mf);
        macApp.showBoton();
        macApp.showVentana();
    }
}