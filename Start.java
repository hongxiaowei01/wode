public class Start {
    public static void main(String[] args){
        Cat cat = new Cat("Jack","黑色");
        cat.eat();
        cat.sleep();
        cat.run();
    }
}
class Animal
{
    String name;
    public Animal(){}
    public Animal(String name)
    {
        this.name = name;
    }
    void eat()
    {
        System.out.println(name + "正在吃");
    }
    void run()
    {
        System.out.println(name + "正在奔跑");
    }
    void sleep()
    {
        System.out.println(name + "正在睡觉");
    }
}
class Cat extends Animal {
    String color;
    public Cat(String name,String color)
    {
        this.name = name;
        this.color = color;
    }
    void eat()
    {
        System.out.println(color + "的" + name + "正在吃鱼");
    }
}//当子类和父类出现同样的函数时，子类的方法会将父类的方法覆盖 这个被称为重写或者覆盖
