package com.haspedu.extend_.exercise;

//分析出有默认的super()
public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B();//a,b name,b
        //调用b类的无参构造器
        //找到this("abc")调用本类中带字符串的构造器
        //B(String name),在这个构造器中有一个默认的super()方法
        //默认调用父类无参构造器A()
    }

}
class A {
    public A(){
        System.out.println("a");
    }
    public A(String name){
        System.out.println("a name");
    }
}
class B extends A{
    public B(){
        //super();this和super不能同时出现，没有super
        this("abc");
        System.out.println("b");
    }
    public B(String name){
        //默认有super()构造器
        System.out.println("b name");
    }
}