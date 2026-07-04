class Math{
     
    public int add(int n1,int n2){
        return n1+n2;
    }
    public static int mul(int n1,int n2){
        return n1*n2;
    }
}


public class Task3 {
    public static void main(String[] args){
        Math.mul(20,30);//static method
        Math obj = new Math();
        obj.add(20,30);
        System.out.println(Math.mul(20,30));

    }
    
}
