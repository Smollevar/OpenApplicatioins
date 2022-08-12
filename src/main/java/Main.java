import java.io.IOException;

public class Main {
    private static int account = 0;

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        try{
            System.out.println("Launch steam");
            r.exec("/c/Users/ugand/Desktop");
            account++;
        } catch (IOException e) {
            System.out.println("Cant find or launch app");
        }
    }
}
