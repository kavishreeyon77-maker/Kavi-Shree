 class Calculator  {
    double add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
        
    }
    double add(double a,double b){
        return a+b;
    }
    
}
public class PolymorphismEx {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.add(11,22);
        c.add(11,22,33);
        c.add(11.5,22.5);
        

}
}