
package PracticalJava7thSem.InnerClassesTypes;
public class NestedClassEg {
    class Inner {
        public void show()
        {
            System.out.println("In a nested class method");
        }
    }
}
class Main {
    public static void main(String[] args)
    {
        NestedClassEg.Inner in = new NestedClassEg().new Inner();
 
        in.show();
    }
}
