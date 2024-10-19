import java.util.Scanner;

public class YandexIkarFLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = 100;
        int wetMax = 1;
        int okMin = 1_000_000;
        String response = "";
        while (okMin - wetMax > 1) {
            System.out.println(height);
            System.out.flush();
            response = scanner.next();
            if (response.equals("wet")) {
                wetMax = height;
                height = (okMin + wetMax) / 2;
            }
            else if (response.equals("ok")) {
                okMin = height;
                height = (okMin + wetMax) / 2;
            }
            else System.exit(0);
        }
        System.out.println("! " + okMin);
    }
}