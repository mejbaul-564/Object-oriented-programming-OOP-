public class Teacher {
    String name;
    int id;
//default constructor
Teacher(){
    System.out.println("null value");
}
    //Para meterrized Constructor is special type of method that do not return type
    Teacher(String n,int i){
        name=n;
        id=i;
    }
    //display method
    void display(){
        System.out.println("Name : "+name);
        System.out.println("id : "+id);
    }

}
