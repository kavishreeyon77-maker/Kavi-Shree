class Student{
    String name;//instance variable
    int rollno;
    //constructor
    Student(){
        name="default name";
        rollno=1;
    }
    //parameterized
    Student(String n,int roll){//local variable
        this.name=n;
        this.rollno=roll;
    }
    //behaviour
    void sleep(){
        System.out.println(name+" sleeping");
    }
}


public class ClassEx {
    public static void main(String[] args) {
        Student s1=new Student("pattani",44);
        Student s2=new Student();
       /* s1.name="buddi";*/ 
        s1.sleep();
        System.out.println(s1.name);
        System.out.println(s1.rollno);


    }
    
}
