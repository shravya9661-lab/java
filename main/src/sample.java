package Interfaces;

interface NSam{
    void cse_dept();
    void com_dept();
    void math_dept();
    void languages();

}
class Students implements NSam{
    public void cse_dept(){
        System.out.println("students form cse dept");
    }
    public void com_dept() {
        System.out.println("students form com dept");
    }
    @override
    public void math_dept(){
        System.out.println("students form math dept");
    }
    public void languages(){
        System.out.println("students form languages dept");
    }
}
public class sample1 {
    public static void main(String[]args) {
    }
}