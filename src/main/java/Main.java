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
            throw new RuntimeException(e);
        }
    }
}
