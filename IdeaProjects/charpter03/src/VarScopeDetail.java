public class VarScopeDetail {
    public static void main(String[] args) {
        Person01 p1 = new Person01();
        p1.say();
        //当执行say方法时，
        //say方法的局部变量比如name,会创建
        //say执行完毕后，name局部变量就销毁，
        // 但是属性(全局变量)仍然可以使用

        R r = new R();
        r.test();//第一种跨类访问对象属性的方式

        r.test2(p1);//

        //局部变量 只能在本类中对应的方法中使用


    }
}
class R {
    //全局变量 可以被本类使用
    //或其他类的使用(通过对象调用)
    public void test(){
        Person01 p1 = new Person01();
        System.out.println(p1.name);//jack
    }
    public void test2(Person01 p){
        System.out.println(p.name);
    }
}
class Person01{
    //属性可以加修饰符
    //局部变量不能加修饰符
    private int age = 20;

    String name = "jack";

    public void say(){
        //细节 属性和局部变量可以重名，访问时遵循就近原则
        String name = "king";
        System.out.println("say() name=" + name);
    }

    public void hi(){
        String address = "北京";
     // String address = "上海";//错误，重复定义变量
        String name = "hsp";
    }

}
