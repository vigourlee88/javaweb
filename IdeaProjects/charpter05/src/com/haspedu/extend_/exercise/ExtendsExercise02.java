package com.haspedu.extend_.exercise;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        CC cc = new CC();
        //new CC(),先找他的无参构造器CC()
        //this("hello");调用本类的有参构造器，后面sout不执行
        //找到CC(String name)构造器，
        // 进入super("haha");
        // 找到父类String的构造器BB(String name)
        //传入haha,隐藏一个默认super();
        //找到默认super()，父类构造器AA()
        //AA类也隐藏默认super(),父类是Object,没有输出
        //方法调用后返回到调用的地方
    }
}
class AA{
    public AA(){
        System.out.println("我是AA类");
    }
}
class BB extends AA{
    public BB() {
        System.out.println("我是BB类的无参构造器");
    }
    public BB(String name) {
        System.out.println(name + "我是BB类的有参构造器");
    }
}
class CC extends BB {
    public CC() {
        this("hello");
        System.out.println("我是CC类的无参构造器");
    }

    public CC(String name) {
        super("haha");
        System.out.println("我是CC类的有参构造器");
    }
}