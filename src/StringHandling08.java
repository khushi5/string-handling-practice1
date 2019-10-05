import java.util.Scanner;

public class StringHandling08 {
    public String inputString;

    public StringHandling08(String inputString) {
        this.inputString=inputString;
    }

    public static void main(String[] args) {
        double UpperWeight=0;
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        StringHandling08 stringHandling08 = new StringHandling08(inputString);
        for(int i=0;i<inputString.length();i++){
            if(inputString.charAt(i)>='A' && inputString.charAt(i)<='Z'){
                UpperWeight=UpperWeight+(int)(inputString.charAt(i));
            }
        }
        System.out.println(UpperWeight);
        scanner.close();
    }
}
