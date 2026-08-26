package sets;
interface Nsam
{
    void cal(int a, int b);
}

public class sample2 {
    public static void main(String[]args) {

        Nsam n = (int x, int y) -> {
            System.out.println("sum:" + (x + y));
        };
        n.cal(10, 20);

        Nsam n1 = (int x, int y) -> {
            System.out.println("sum:" + (x - y));
        };
        n1.cal(10, 20);
        Nsam n2= (int x, int y) -> {
            System.out.println("sum:" + (x * y));
        };
        n2.cal(10, 20);
        }
    }

