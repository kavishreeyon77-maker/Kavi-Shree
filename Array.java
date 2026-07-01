import java.util.Scanner;

public class Array {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] num = new int[n];
         
        for(int i =0;i<n; i++){
            num[i] = input.nextInt();
        }
        for(int i=0;i<n/2;i++){
            int temp = num[i];
            num[i]=num[n-1-i];
            num[n-1-i]=temp;
             

        }
        for(int ks:num){
             System.out.print(ks+" ");
        }
         
      
           /*  for(int i =0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        int max=arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }         
            System.out.println("Max value is:"+max);*/
            
        
  
       /*  int[] arr = new int[5];
        for(int i =0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
       /*  int[] arr = new int[5];
        int[] arr1 = {1,2,3,4,5};
        System.out.println(arr1[3]);*/
    
}
}
