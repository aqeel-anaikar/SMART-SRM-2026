import java.util.Scanner;
public class hi {
    public static int revInt(int x) {
        String s = Integer.toString(x);
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            s2 = s.charAt(0) + s2;
        }
        return Integer.parseInt(s2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(revInt(x));
    }
}