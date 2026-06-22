import java.util.Scanner;

public class SimpleInterest {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int P=input.nextInt();
        int R=input.nextInt();
        int T=input.nextInt();
       int SI=(P*R*T)/100;
        System.out.println(SI);
     }

    
}
