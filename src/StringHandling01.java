import java.util.Scanner;

public class StringHandling01 {
    public String value;

    public StringHandling01(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        StringHandling01 stringHandling01 = new StringHandling01(value);
        System.out.println("Output:\n");
        System.out.print("index:");
        for (int i=0;i<value.length();i++){
            System.out.print("\t"+i);
        }
        System.out.print("\nchars:");
        for (int j=0;j<value.length();j++){
            System.out.print("\t"+value.charAt(j));
        }
        scanner.close();
    }
}