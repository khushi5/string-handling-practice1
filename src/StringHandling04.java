import java.util.Scanner;

public class StringHandling04 {
    public String inputString;

    public StringHandling04(String inputString) {
        this.inputString = inputString;
    }

    public static void main(String[] args) {
        int count=1;
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        StringHandling04 stringHandling04 = new StringHandling04(inputString);
        for(int i=0;i<inputString.length();i++) {
            if(inputString.charAt(i)=='a' | inputString.charAt(i)=='e' | inputString.charAt(i)=='i'
            | inputString.charAt(i)=='o' | inputString.charAt(i)=='u'){
                if(count==1){
                    inputString=inputString.replace(inputString.charAt(i),'*');
                    count++;
                }
                else if(count==2){
                    inputString=inputString.replace(inputString.charAt(i),'^');
                    count++;
                }
                else if(count==3){
                    inputString=inputString.replace(inputString.charAt(i),'!');
                    count=1;
                }
            }
            scanner.close();
        }
        System.out.println(inputString);
    }
}