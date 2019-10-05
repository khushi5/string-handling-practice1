import java.util.Scanner;

public class StringHandling11 {
    public String inputString;
    public char ch;

    public StringHandling11(String inputString, char ch) {
        this.inputString=inputString;
        this.ch=ch;
    }

    public static void main(String[] args) {
        int index;
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        char ch= scanner.next().charAt(0);

        StringHandling11 stringHandling11 = new StringHandling11(inputString,ch);
            index = inputString.indexOf(ch);
            while (index>=0){
                System.out.println(index);
                index=inputString.indexOf(ch,index+1);
            }
    }
}
