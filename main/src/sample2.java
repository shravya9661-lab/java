package interfaces;
//interface to interface ---->extends
//interface to class --->implements
//class to class -->extends
interface NSam{
    int a=10;
     default void cse_dept(){
         System.out.println("cse_dept");
     }
    void com_dept();
    void languages_dept();
    void math_dept();
}

