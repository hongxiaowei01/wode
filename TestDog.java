public class TestDog {
    public static void main(String args[]) {
        Animal2 a = new Animal2();
        //Animal2 b = new Dog1();

        a.move();
       // b.move();
        //b.park();
    }
}
class Animal2{
    public void move(){
        System.out.println("动物可以移动");
    }
    public void park(){
        System.out.println("狗可以叫");
    }
}
class Dog1 {
    public void move(){
        System.out.println("狗可以跑和走");
    }
    public void park(){
        System.out.println("狗可以叫");
    }
}