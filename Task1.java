class Car{
    String make;
    String model;
    int year;

    Car(String m,String mo,int y){
        this.make=m;
        this.model=mo;
        this.year=y;
    }
    void displayInfo(){
        System.out.println(make+ " "+ model+" "+year);
    }

}






public class Task1 {

    public static void main(String[] args){
        Car c1=new Car("Tokeyo","corrola",2026);
        c1.displayInfo();

    }
    
}
