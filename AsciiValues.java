import java.util.Scanner;

public class AsciiValues {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char letter = input.next().charAt(0);
        int val = letter;
        if(val>=65 && val<=90) {
            System.out.println("Uppercase");
        }
        else if(val>=97 && val<=122) {
            System.out.println("Lowercse");
        }
        else if(val>=48 && val<=57) {
            System.out.println("Numbers");
        }
        else 
        {
            System.out.println("Symbols");
        }

    }

    
}
