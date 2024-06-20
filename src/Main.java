import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String lower = line.toLowerCase();
        char[] chars = lower.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i+1; j < chars.length; j++) {
                if (chars[i] == chars[j] && !Character.isDigit(chars[i])) {
                    count++;
                }
            }
        }
        if (count==1) count++;
        System.out.println("Количество повторяющихся букв: " + count);
    }
}