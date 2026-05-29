import java.util.EventListener;

public interface Subscriber extends EventListener {
    void onEvent(Evento e);
}
