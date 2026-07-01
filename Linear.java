import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] num = new int[n];
         
        for(int i =0;i<n; i++){
            num[i] = input.nextInt();
        }
        int target=input.nextInt();
        boolean isFound=false;
        for(int i:num){
            if(i==target){
                System.out.println("value is found");
                isFound=true;
            }
        }

        if(! isFound){
                System.out.println("value is not found");

            

        }

}

    }
