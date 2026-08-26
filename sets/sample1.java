package sets;
interface  Nsam
{
    void cse();
    void ece();
}
class Students implements Nsam{
    public void cse() {
        System.out.println("Students from cse dept");
    }

}
public class sample1 {
    public static void main(String[] args){
        Nsam n=new Nsam(){
            @Override
            public void cse()
            {
                System.out.println("cse dept");
            }

            @Override
            public void ece()
            {
                System.out.println("ece dept");
            }
        };
        n.cse();
        n.ece();
    }
}
