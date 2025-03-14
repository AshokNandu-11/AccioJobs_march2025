import java.io.CharArrayWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ParentClass2 pc = new ParentClass2();
        pc.printMethod();
        pc.invoked();
        pc.setAge(25);
        System.out.println(pc.getAge());
        CheckValue cv = new CheckValue();
        cv.printValue();
    }
}