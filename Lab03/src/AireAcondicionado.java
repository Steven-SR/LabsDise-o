public class AireAcondicionado implements Subscriber{
    private Estado estado;

    public AireAcondicionado(){
        estado = Estado.Apagado;
    }

    private void printEstado(){
        System.out.println("El aire acondicionado está " + estado.toString());
    }

    @Override
    public void onEvent(Evento event){
        if (event.getTemperatura()>=26){
            estado = Estado.Encendido;
            printEstado();
            return;
        }
        estado = Estado.Apagado;
        printEstado();
    }
}
