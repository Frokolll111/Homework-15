public class ServiceStation {
    public void check(Transport transport) {
        transport.service();
        transport.checkEngine();
        transport.checkTrailer();
    }
}
