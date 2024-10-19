import java.util.Scanner;
public class YandexDanceLength {
    public static void main(String[] args) {
        String dance = new Scanner(System.in).next();
        int length = dance.length();
        int R = 0, L = 0, M = 0, max = 1;
        for (int i = 0; i < length; i++) {
            char current = dance.charAt(i);
            if (current == 'R') R++;
            if (current == 'L') L++;
            if (current == '?') M++;
            max = Math.max(Math.abs(L-R) + M, max);
        }
        System.out.println(max);
    }
}