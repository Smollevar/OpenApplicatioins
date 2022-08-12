import java.io.IOException;

public class Main {
    private static int account = 0;

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        try{
            System.out.println("ss");
            r.exec("steam");
            account++;

        } catch (IOException e) {
            System.out.println("Cant find application with this name...");
            try {
                r.exec("Steam");
            } catch (IOException ex) {
                System.out.println("Another try...");
                try {
                    r.exec("Steam.exe");
                } catch (IOException exc) {
                    throw new RuntimeException(exc);
                }
            }
        }
    }
}
