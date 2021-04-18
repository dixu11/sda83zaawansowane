package interfaces.interfaceZastosowanie;

class Demo {
    public static void main(String[] args) {
        Repository repository = new FileRepository();
        Application application = new Application(repository);
        application.start();
        application.close();
    }
}
