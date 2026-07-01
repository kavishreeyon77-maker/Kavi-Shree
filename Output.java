import java.util.Scanner;
public class Output {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int age = input.nextInt();
        double percentage = input.nextDouble();
        System.out.println(name);
        System.out.println(age);
        System.out.println(percentage);
    }
}
