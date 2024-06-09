public class ServiceStation {

    public void check(Transport transport) {
        System.out.printf("Обслуживается %s%n", transport.getModelName());
        transport.service();
    }
}
