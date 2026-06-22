import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num = input.nextInt();
        int F = num%10;
        int M = (num/10)%10;
        int L = num/100;
        int reversenum = F*100 + M*10 + L;

        System.out.println(reversenum);
    }
}      
      