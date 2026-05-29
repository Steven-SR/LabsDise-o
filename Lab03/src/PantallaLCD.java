public class PantallaLCD implements Subscriber{
    private  int tempretaura;

    public PantallaLCD(){
        tempretaura=0;
    }

    private void displayTempretura(){
        System.out.println("La temperatura actual es: "+tempretaura);
    }

    @Override
    public void onEvent(Evento e) {
        tempretaura = e.getTemperatura();
        displayTempretura();
    }
}
