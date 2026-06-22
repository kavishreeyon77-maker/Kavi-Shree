import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        char cal = input.next().charAt(0);

        switch (cal) {
            case '+':
                int add = a + b;
                System.out.println("Addition:"+add);
                break;
            case '-':
                int sub = a - b;
                System.out.println("Subraction:"+sub);
                break;
            case '*':
                int mul = a * b;
                System.out.println("Multiplication:"+mul);
                break;
            case '/':
                int div = a/b;
                System.out.println("Division:"+div);
                break;
            default:
                System.out.println("Wrong values");
                break;    
        }
    }

    
}

    

