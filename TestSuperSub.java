
class SuperClass {
    private int n;
    SuperClass(){
        System.out.println("SuperClass()");
    }
    SuperClass(int n){
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}
class SubClass extends SuperClass{
    private int n ;
    SubClass(){
        System.out.println("SubClass");
    }
    public SubClass(int n){
        super(300);
        System.out.println("SubClass（int n ):" + n);
        this.n = n;
    }
}
class SubClass1 extends SuperClass{
    private int n ;
    SubClass1(){
        super(300);
        System.out.println("SubClass1");
    }
    public SubClass1(int n){
        super(300);
        System.out.println("SubClass1（int n ):" + n);
        this.n = n;
    }
}
public class TestSuperSub {
    public static void main (String[] args){
       SubClass sc1 = new SubClass();
       SubClass sc2 = new SubClass(100);

       SubClass1 sc3 = new SubClass1();
       SubClass1 sc4 = new SubClass1(200);
    }
}
//子类创建调用构造函数时 ，会自动调用父类的无参构造函数，若要调用
//父类的有参构造函数必须使用super来调用
