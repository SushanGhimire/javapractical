
package PracticalJava7thSem.InnerClassesTypes;

public class LocalInnerClassEg {
    void outerMethod()
    {
 
        System.out.println("inside outerMethod");
        class Inner {
            void innerMethod()
            {
                System.out.println("inside innerMethod");
            }
        }
        Inner y = new Inner();
        y.innerMethod();
    }
}
class GFG {
    public static void main(String[] args)
    {
        LocalInnerClassEg x = new LocalInnerClassEg();
        x.outerMethod();
    }
}
