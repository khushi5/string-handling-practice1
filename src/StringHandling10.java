import java.util.Scanner;

public class StringHandling10 {
    public String inputString;
    public char ch;

    public StringHandling10(String inputString, char ch) {
        this.inputString=inputString;
        this.ch=ch;
    }

    public static void main(String[] args) {
        int index;
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        char ch= scanner.next().charAt(0);

        StringHandling10 stringHandling10 = new StringHandling10(inputString,ch);
        index=inputString.indexOf(ch);
        System.out.println(index);
    }
}
