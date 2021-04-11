public class Client {

    public static void main(String[] args) {
        LogFactory factory;
        Log log;
        factory = ProductFactory.Product("Console");
        log = factory.productLog();
        log.createLog();
    }
}