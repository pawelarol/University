import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a ->");
            int a = scanner.nextInt();
            System.out.println("Enter b ->");
            int b = scanner.nextInt();

            String s1 = (a != b) ? "!=" : "=";
            String s2 = (a < b) ? "<" : (a == b) ? "=" : ">";
            System.out.println(a + s1 + b);
            System.out.println(a + s2 + b);

        }
    }
}
