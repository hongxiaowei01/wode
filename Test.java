public class Test {
    public static void main(String[] args){
        Animall a = new Animall();
        a.eat();
        Dog d = new Dog();
        d.eatTest();
    }
}
class Animall {
    void eat() {
        System.out.println("animal : eat");
    }
}
class Dog extends Animall{
    void eat(){

            System.out.println("dog : eat");
    }
    void eatTest(){
        this.eat();
        super.eat();
    }
}
