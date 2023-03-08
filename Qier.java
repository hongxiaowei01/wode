public class Qier {
    private String name;
    private int id;
    public Qier(String myName, int myid){
        name = myName;
        id = myid;
    }
    public void sleep(){
        System.out.println("我在睡觉");
    }
    public void eat(){
        System.out.println("我在吃草");
    }
    public void introdution(){
        System.out.println("大家好我是" + name + "号" +  id);
    }
}

