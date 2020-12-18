public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Adaptee());
        System.out.println(adapter.outputByBoolean());
    }

}
