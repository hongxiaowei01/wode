public class Puppy {
    int puppyAge;
    public Puppy(String name){
        System.out.println("小狗狗的名字："+name);
    }
    public void setAge(int age){
        puppyAge = age;
    }
    public int getAge(){
        System.out.println("小狗的年齡："+puppyAge);
        return puppyAge;
    }
    public static void main(String[] args){
        Puppy mypuppy = new Puppy("hanrry");
        mypuppy.setAge(999);
        mypuppy.getAge();
        System.out.println("变量值：" +mypuppy.puppyAge);
    }
}
