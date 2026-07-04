class Book{
    String title;
    String author;

    Book(String title,String author){
        this.title=title;
        this.author=author;
    }

    Book(String title){
        this.title=title;
        author="unknown";

    }
    void displayInfo(){
        System.out.println(title+" "+author);
    }
}


public class Task2 {
     public static void main(String[] args){
        Book b1=new Book("The Hobbit","Tolkien");
        Book b2=new Book("The hobbit");
        b2.displayInfo();
        b1.displayInfo();

     }
    
}
