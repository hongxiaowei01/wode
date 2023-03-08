package bao;
class A{
    public void fangFa(){
        System.out.println("A");
    }
}
class B extends A{
    public void fangFa(){
        System.out.println("b");
    }
    public void fangFa1(){
        System.out.println("C");
    }
}

public class TestA {
    public static void main(String [] args){
        A a= new A();
        A b= new B();
        a.fangFa();
        b.fangFa();
        b.fangFa1();
    }
}
