public class MainClient {
    public static void main(String[] args) {
        var client = new WelcomeClient();
        client.connecta("127.0.0.1", 6000);
        System.out.println("El servidor diu: " + client.llegeixMissatge());
    }
}
