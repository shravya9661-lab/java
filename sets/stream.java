package sets;
 import java.util.ArrayList;
 class employee{
     int age;
     String name;
     String dept;
      public employee(int age,String name,String dept){
          this.age=age;
          this.name=name;
          this.dept=dept;
      }
     public int getAge() {
         return age;
     }
     public String getName() {
          return name;
     }

     public String getDept() {
          return dept;
     }
 }
public class stream {
     public static void main(String[]args){
         ArrayList<employee>list=new ArrayList<>();
         employee e1=new employee(10,"siya","sales");
         list.add(e1);
         list.add(new employee(20,"riya","sales"));
         list.add(new employee(30,"diya","IT"));
          for(employee e:list)
          {
              System.out.println(e.getAge()+" "+e.getName()+" "+e.getName());
          }


     }
}
