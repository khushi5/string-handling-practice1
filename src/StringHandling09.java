import java.util.Scanner;

public class StringHandling09 {
    public String inputString;

    public StringHandling09(String inputString) {
        this.inputString=inputString;
    }

    public static void main(String[] args) {
        double UpperWeight=0;
        double LowerWeight=0;
        double absoluteWeight=0;
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        StringHandling09 stringHandling09 = new StringHandling09(inputString);
        for(int i=0;i<inputString.length();i++){
            if(inputString.charAt(i)>='A' && inputString.charAt(i)<='Z'){
                UpperWeight=UpperWeight+(int)(inputString.charAt(i));
            }
            if(inputString.charAt(i)>='a' && inputString.charAt(i)>='z'){
                LowerWeight=LowerWeight+(int)(inputString.charAt(i));
            }
        }
        absoluteWeight=UpperWeight-LowerWeight;
        System.out.println(absoluteWeight);
        scanner.close();
    }
}
