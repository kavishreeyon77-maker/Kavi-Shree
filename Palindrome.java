import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        int n=s.length();
        for(int i =0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;

            }
            
        }
        return true;

    
   
}
   public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
       String s=in.next();
       if(isPalindrome(s)){
        System.out.println("Palindrome");
       }
       else{
        System.out.println("Not Palindrome");

       }
   }
}   
        