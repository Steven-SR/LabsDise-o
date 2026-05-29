public interface Publisher {
    void addSubscriptor(Subscriber s);
    void removeSubscriptor(Subscriber s);
    void publish();
}
