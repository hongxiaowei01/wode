public class RunEncap {
    public static void main(String [] args){
        EncapTest encap = new EncapTest();
        encap.setAge(200);
        encap.setIdNum("llllll");
        encap.setName("kaka");
        System.out.println("你好我是：" + " " + encap.getName() + "今年我已经："+ " " + encap.getAge() + " "+ "我的id是："+ "                                                  " + encap.getIdNum());
    }
}
