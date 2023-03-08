public class Sleeeep implements Animal4{
    public void eat3(){
        System.out.println("eat3");
    }
    public void sleep3(){
        System.out.println("sleep3");
    }
    public void run1(){
        System.out.println("run1");
    }
    public void see(){
        System.out.println("see");
    }
    public static void main(String[] args){
        Sleeeep aa = new Sleeeep();
        aa.eat3();
        aa.see();
        aa.run1();
        aa.sleep3();
    }
}
