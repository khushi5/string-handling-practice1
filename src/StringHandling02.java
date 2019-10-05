import java.util.Scanner;

public class StringHandling02 {
    public String inputString;
    public int index;

    public StringHandling02(String inputString, int index) {
        this.inputString=inputString;
        this.index=index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int index = Integer.parseInt(scanner.next());

        StringHandling02 stringHandling02 = new StringHandling02(inputString, index);
        inputString=inputString.substring(index);
        System.out.println(inputString);
        scanner.close();
    }
}
