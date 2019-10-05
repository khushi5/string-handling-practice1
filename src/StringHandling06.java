import java.util.Scanner;

public class StringHandling06 {
    public String inputString;

    public StringHandling06(String inputString) {
        this.inputString=inputString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        StringHandling06 stringHandling06 = new StringHandling06(inputString);
        inputString=inputString.toUpperCase();
        System.out.println(inputString);
        scanner.close();
    }
}
