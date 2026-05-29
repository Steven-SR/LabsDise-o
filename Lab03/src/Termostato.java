public class Termostato implements Subscriber{
    private Estado estado;

    public Termostato(){
        estado = Estado.Apagado;
    }

    private void printEstado(){
        System.out.println("El termostato está " + estado.toString());
    }

    @Override
    public void onEvent(Evento event){
        if (event.getTemperatura()<=16){
            estado = Estado.Encendido;
            printEstado();
            return;
        }
        estado = Estado.Apagado;
        printEstado();
    }
}

