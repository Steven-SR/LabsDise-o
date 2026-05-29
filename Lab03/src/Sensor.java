import java.util.ArrayList;
import java.util.List;

public class Sensor implements Publisher {
    private final List<Subscriber> subscribers;
    private int temperature;
    public Sensor(){
        subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriptor(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void removeSubscriptor(Subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public void publish() {
        Evento evento = new Evento(this, this.temperature);
        for (Subscriber s : subscribers) {
            s.onEvent(evento);
        }
    }

    public void lectura(int temperature) {
        this.temperature = temperature;
        publish();
    }
}
