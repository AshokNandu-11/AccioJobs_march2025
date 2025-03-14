public class Keyword {
    private int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void printMethod(){
        System.out.println("parentClass1");
    }
    void invoked(){
        System.out.println("Method Invoked");
    }
}
class CheckValue extends Keyword{
    void printValue(){
        System.out.println("This is working");
    }
}
