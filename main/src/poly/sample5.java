package poly;

public class sample5 {
    void add(int a,int b){
        System.out.println("sum:"+(a+b));
    }
    void add(int a,float b){
        System.out.println("sum:"+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("sum:"+(a+b+c));
    }
    public static void main(String[]args){
       sample5 x=new sample5();
        x.add(10,20);
        x.add(10,20.28f);
        x.add(10,20,30);
    }
}
