
package PracticalJava7thSem;

public class This_Keyword {
    String name;
    int age;
    public void Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public static void main(String args[]){
        This_Keyword t= new This_Keyword();
        t.Person("Sushan", 24);
        System.out.println(t.name + " "+ t.age);
    }
}
