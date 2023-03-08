public class MammalInt implements Animal3{
    public void eat3(){
        System.out.println("我睡了");
    }
    public void sleep3(){
        System.out.println("我吃sile");
    }
    public int noOfLegs(){
        return 0;
    }
    public static void main(String args[]){
        MammalInt m = new MammalInt();
        m.eat3();
        m.sleep3();
    }

}
