package poly1;
class parent1{
    int x=10;
    void display(){
        System.out.println("from parent class");
    }
}
class child extends parent1{
    void print(){
        System.out.println(super.x);
super.display();
    }
}
public class simple6 {
    public static void main(String[]args){
        child c=new child();
        c.print();
    }
}
