public class Constructor01 {
    public static void main(String[] args) {
        //当我们new一个对象时，直接通过构造器指定名字和年龄
        Person03 p1 = new Person03("smith", 80);
        System.out.println("p1的信息如下");
        System.out.println("p1对象name=" + p1.name);
        System.out.println("p1对象age=" + p1.age);
    }
}
//在创建人类对象时，就直接指定这个对象的年龄和姓名
class Person03{
    String name;
    int age;
    //构造器
    //1.构造器没有返回值，也不能写void
    //2.构造器的名称和类名一样
    public Person03(String pName,int pAge){
        System.out.println("构造器被调用~~完成对象属性的初始化");
        name = pName;
        age = pAge;
    }

}