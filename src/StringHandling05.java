import java.util.Scanner;

public class StringHandling05 {
    public String inputString;
    int index;

    public StringHandling05(String inputString,int index) {
        this.inputString=inputString;
        this.index=index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int index=Integer.parseInt(scanner.next());

        StringHandling05 stringHandling05 = new StringHandling05(inputString,index);

        inputString=inputString.replace(inputString.substring(index),inputString);
        System.out.println(inputString);
        scanner.close();
    }
}
