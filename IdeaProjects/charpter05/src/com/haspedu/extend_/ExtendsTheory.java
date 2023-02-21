package com.haspedu.extend_;

/*
讲解继承本质
 */
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();//内存的布局
        //按照查找关系来返回信息
        //1.首先看子类是否有该属性
        //2.如果子类有这个属性，并且可以访问，则返回信息
        //3.如果子类没有这个属性,
        // 就看父类有没有这个属性(如果父类有该属性，并且可以访问，则返回信息)
        //4.如果父类没有 就按照3的规则，继续找上级父类，直到Object
        System.out.println(son.name);//大头儿子
        //System.out.println(son.age);//39  私有属性只能本类访问
        System.out.println(son.getAge());//39 通过父类Father提供的公共方法去访问
        System.out.println(son.hobby);//旅游

    }
}
class GrandPa{
    String name = "大头爷爷";
    String hobby = "旅游";

}
class Father extends GrandPa{//父类
    String name = "大头爸爸";
    private int age = 39;

    public int getAge(){
        return age;
    }
}
class Son extends Father{//子类
    String name = "大头儿子";
}
