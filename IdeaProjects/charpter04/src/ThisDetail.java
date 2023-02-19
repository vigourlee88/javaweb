public class ThisDetail {
    public static void main(String[] args) {
//        T t1 = new T();
//        t1.f2();
        T t2 = new T();


    }
}
class T {
    String name = "jack";
    int num = 100;
    /*访问构造器语法 this.(参数列表);
       注意只能在构造器中使用
       (即只能在构造器中访问另一个构造器)
       注意
       访问构造器语法 this.(参数列表);必须放置第一条语句
      */
    public T(){
        //这里去访问T(String name,int age)构造器
        this("jack",100);//放在第一条语句
        System.out.println("T() 构造器");
    }
    public T(String name,int age){
        System.out.println("T(String name,int age) 构造器");
    }
    //this关键字可以用来访问本类的属性
    public void f3() {
        String name  = "smith";
        //name是找局部变量 就近原则
        System.out.println("name=" + name+ "num=" + num);
        //使用this访问属性
        System.out.println("name=" + this.name+ "num=" + this.num);
    }
    //细节 访问成员方法的语法 this.方法名(参数列表)
    public void f1(){
        System.out.println("f1() 方法..");
    }
    public void f2(){
        System.out.println("f2() 方法..");
        //调用本类的f1
        //第一种方式
        f1();
        //第一种方式
        this.f1();
    }
}
