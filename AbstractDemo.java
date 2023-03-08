public class AbstractDemo {
    public static void main(String[] args){
        Salary s = new Salary("Mohd Mohtashim","Amberhta,UP",3 ,3600.00);
        Employee e = new Salary("John Adam", "Booton, MA",2 ,2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\nCall mailCheck using Employee reference --");
        e.mailCheck();
    }
}
