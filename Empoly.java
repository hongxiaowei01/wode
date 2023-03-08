import java.io.*;

public class Empoly {
   String name;
   int age;
   String designation;
   double salary;
   public Empoly(String name){
      this.name=name;
   }
   public void empAge(int emAge){
      age = emAge;
   }
   public void empDesignation(String emDesig){
      designation = emDesig;
   }
   public void empSalary(double empSalary){
      salary = empSalary;
   }
   public void printEmpoly(){
      System.out.println("你的名字："+ name);
      System.out.println("你的年龄："+ age);
      System.out.println("你的职位："+ designation);
      System.out.println("薪水："+ salary);
   }
}
