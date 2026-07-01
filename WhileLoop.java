import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        int r=0;
        while(num>0){
            int a = num%10;
            r=r*10+a;
            num=num/10;
        }
        System.out.println(r);
      /*   int sum=0;
        int num= 12345;
        while(num>0){
            int r = num%10;
            sum=sum + r;
            num=num/10;

        }
        System.out.println(sum);*/

       /*   int count = 0;
         int num=412364;

         while(num>0){
            num=num/10;
            count++;
        }
         System.out.println(count);
       /*  int i = 1;
        while(i<=5){
            System.out.println(i*5);
        }*/

    }
}
