package Github11;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Starting Gitpull execution...");

        // Call your existing Gitpull methods if needed
        Gitpull gitpull = new Gitpull();
        gitpull.pullRepo(); // Assuming your Gitpull class has a method like this

        System.out.println("Gitpull execution completed.");
    }
}
