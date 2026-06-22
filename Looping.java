import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){

              System.out.print(" "); 
            
          }
            for(int j=1;j<=n-i;j--){
              System.out.print(" * ");
             }

               System.out.println();
        }
        
       /* for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){

              System.out.print(" "); 
            
          }
            for(int j=1;j<=(i*2-1);j++){
              System.out.print(" * ");
             }

               System.out.println();
        } */
         
        

        /*for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){

            System.out.print(j+" "); 
            
        }
        System.out.println();
        */

        /* for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){

            System.out.print("* ");
            
        }
        System.out.println(); */


       /*for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){

            System.out.print(j+" ");
            
        }
        System.out.println();

        } */
      
    }
}
        

    

