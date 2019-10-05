import java.util.Scanner;

public class StringHandling03 {
    public String inputString;

    public StringHandling03(String inputString) {
        this.inputString=inputString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        StringHandling03 stringHandling03 = new StringHandling03(inputString);
        inputString=inputString.replace('a','*');
        inputString=inputString.replace('e','*');
        inputString=inputString.replace('i','*');
        inputString=inputString.replace('o','*');
        inputString=inputString.replace('u','*');
        System.out.println(inputString);
        scanner.close();
    }
}
