import java.util.Scanner;

public class StringHandling07 {
    public String inputString;

    public StringHandling07(String inputString) {
        this.inputString=inputString;
    }

    public static void main(String[] args) {
        double totalWeight=0;
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        StringHandling07 stringHandling07 = new StringHandling07(inputString);
        for(int i=0;i<inputString.length();i++){
            totalWeight=totalWeight+(int)(inputString.charAt(i));
        }
        System.out.println(totalWeight);
        scanner.close();
    }
}
