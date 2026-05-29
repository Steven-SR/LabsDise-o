import java.util.EventObject;

public class Evento extends EventObject {
    private final int temperatura;

    public Evento(Object source, int temperatura) {
        super(source);
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }
}
