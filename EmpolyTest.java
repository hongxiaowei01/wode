import java.io.*;

public class EmpolyTest {
    public static void main(String[] args){
        Empoly empOne = new Empoly("runoob1");
        Empoly empTwo = new Empoly("runoob2");

        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmpoly();

        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟程序员");
        empTwo.empSalary(223);
        empTwo.printEmpoly();
    }
}
