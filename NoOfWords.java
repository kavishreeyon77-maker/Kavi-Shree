public class NoOfWords {
     public static void main(String[] args) {
        String s ="Hello from java programming";
        String[] arr=s.split(s)
        
        int wordCount=0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)==32){
                wordCount++;
            }
        }
        System.out.println(wordCount+1); *

      /*  String s ="Hello from java programming";
        int wordCount=0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)==32){
                wordCount++;
            }
        }
        System.out.println(wordCount+1); */
    }
    
}
